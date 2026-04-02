# QA_jitu

Quality-assurance for **[jitu.one](https://jitu.one)**. This repository is set up for **automated testing** of the public marketing landing page (unauthenticated). **Test automation (scripts, framework project, CI) is not wired up yet**; what exists today is the written test specification in Markdown, which is intended to drive and trace future automation.

## What is here now

- **`TestSuite/Landing page/TestCases/`** — Markdown test cases for the landing page, aligned to a **content snapshot** of the live site (hero, how-it-works, features, roadmap, CTAs, footer, etc.). These files are the **authoritative checklist** until automated suites land.
- Each case file uses a shared table format: ID, title, priority, type, preconditions, steps, and expected results.
- **`TC-LP-00-overview-and-legend.md`** is the entry point: file index, legend (priorities and types), regression triggers, and traceability notes.

## Test case files (current)

| File | Focus |
| --- | --- |
| `TC-LP-00-overview-and-legend.md` | Overview, legend, regression hints |
| `TC-LP-01-page-load-and-shell.md` | Load, title, favicon, document shell |
| `TC-LP-02-hero-and-ctas.md` | Hero and primary/secondary CTAs |
| `TC-LP-03-demo-output-preview.md` | Demo / sample output |
| `TC-LP-04-metrics-trust-strip.md` | Metrics and trust strip |
| `TC-LP-05-how-it-works.md` | How it works (steps) |
| `TC-LP-06-core-features.md` | Core features |
| `TC-LP-07-output-format-table.md` | Output format / sample table |
| `TC-LP-08-built-for-personas.md` | Personas section |
| `TC-LP-09-roadmap.md` | Roadmap |
| `TC-LP-10-footer-closing-cta.md` | Footer and closing CTAs |
| `TC-LP-11-cross-cutting-a11y-performance.md` | A11y, performance, HTTPS, 404 |

## Automation (planned, not present yet)

- No automated test project or scripts (e.g. Selenium/Java or other stack).
- No CI pipeline or scheduled runs in this repo.

When automation is added, this README can point to the framework folder, how to run tests locally, and any CI badge or workflow name.

## Suggested use today

1. Open `TestSuite/Landing page/TestCases/TC-LP-00-overview-and-legend.md`.
2. Execute cases manually in numeric order, or use the regression triggers after deploys.
3. When implementing automation, map automated tests to the **LP-*** IDs in these files for traceability.

---

*Copy and URLs in the test files are meant to match the live landing page; after releases, spot-check for copy and URL drift.*
