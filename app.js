/**
 * app.js  --  LANGUAGE 1: JAVASCRIPT  (connects the HTML page to tax_engine.js)
 * Reads the form, calls TaxEngine.computeReturn(), and fills the report in index.html.
 */
const $ = (id) => document.getElementById(id);
const peso = (n) => "PHP " + Number(n).toLocaleString("en-PH", { minimumFractionDigits: 2, maximumFractionDigits: 2 });

const DEMO = { name: "Dela Cruz, Juan A.", employee_no: "2024-0001", tin: "123-456-789-000",
  agency: "Department of Education", position: "Teacher III (SG-16)", year: 2026,
  monthly_basic_salary: 40000, months_worked: 12, other_taxable_compensation: 0,
  other_13th_month_benefits: 0, tax_withheld: 30000 };

$("year").defaultValue = $("year").value = new Date().getFullYear();

$("demoBtn").onclick = () => Object.entries(DEMO).forEach(([id, v]) => ($(id).value = v));
$("empForm").addEventListener("reset", () => ($("error").style.display = "none"));

$("empForm").addEventListener("submit", (event) => {
  event.preventDefault();
  const data = {};
  for (const el of $("empForm").elements)
    if (el.name) data[el.name] = el.type === "number" && el.value !== "" ? Number(el.value) : el.value;
  try {
    showReport(TaxEngine.computeReturn(data));
    $("error").style.display = "none";
  } catch (err) {
    $("error").textContent = err.message;
    $("error").style.display = "block";
  }
});

function showReport(result) {
  // Every element with data-f="section.field" receives that value from the engine.
  document.querySelectorAll("[data-f]").forEach((el) => {
    const v = el.dataset.f.split(".").reduce((obj, key) => obj[key], result);
    el.textContent = el.dataset.t === "peso" ? peso(v)
      : el.dataset.t === "rate" ? (v * 100).toFixed(0) + "%"
      : el.dataset.t === "pct" ? v + "%" : v;
  });
  const bal = result.taxable.balance;
  const kind = bal > 0 ? "pay" : bal < 0 ? "ref" : "";
  $("balanceValue").textContent = peso(Math.abs(bal));
  $("balanceRow").className = "row " + kind;
  $("verdict").className = "verdict " + kind;
  $("verdictNote").textContent = bal > 0 ? `Still payable: ${peso(bal)}`
    : bal < 0 ? `Over-withheld by ${peso(-bal)}, refundable or creditable`
    : "Tax withheld matches the tax due";
  $("placeholder").style.display = "none";
  $("report").style.display = "block";

  // On phones the result sits below the form, so bring it into view.
  if (matchMedia("(max-width: 899px)").matches) {
    const calm = matchMedia("(prefers-reduced-motion: reduce)").matches;
    $("report").scrollIntoView({ behavior: calm ? "auto" : "smooth", block: "start" });
  }
}
