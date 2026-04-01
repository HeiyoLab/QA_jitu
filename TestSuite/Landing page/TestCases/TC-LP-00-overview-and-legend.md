# Jitu.one — Landing page test suite (overview)

**Path:** `TestSuite/Landing page/TestCases/`  
**Scope:** Public marketing landing at `https://jitu.one` (unauthenticated).  
**Source snapshot:** Content analyzed from live page (hero, how-it-works, features, roadmap, CTAs).

## File index

| File | Area |
| --- | --- |
| `TC-LP-00-overview-and-legend.md` | This file — legend, regression, traceability |
| `TC-LP-01-page-load-and-shell.md` | Page load, title, favicon, document shell |
| `TC-LP-02-hero-and-ctas.md` | Hero copy and primary/secondary CTAs |
| `TC-LP-03-demo-output-preview.md` | Demo / sample output block |
| `TC-LP-04-metrics-trust-strip.md` | Metrics and trust claims |
| `TC-LP-05-how-it-works.md` | How it works (steps 01–04) |
| `TC-LP-06-core-features.md` | Core features grid |
| `TC-LP-07-output-format-table.md` | Output schema and sample table |
| `TC-LP-08-built-for-personas.md` | Built-for personas |
| `TC-LP-09-roadmap.md` | Roadmap Phase 1 / Phase 2 |
| `TC-LP-10-footer-closing-cta.md` | Footer CTAs and GitHub |
| `TC-LP-11-cross-cutting-a11y-performance.md` | Accessibility, performance, HTTPS, 404 |

## Legend

| Field | Meaning |
| --- | --- |
| **ID** | Unique case ID |
| **Priority** | P0 critical path · P1 high · P2 medium · P3 low |
| **Type** | Functional · UI/UX · Content · Link · Cross-cutting |

## Regression triggers (run subset when these change)

- Marketing copy in hero, metrics, or roadmap  
- Dashboard URL path  
- GitHub repository URL  
- New CTAs or sections added to landing layout  
- Global header/footer shared with app  

## Traceability note

Copy and URLs in these files match a **content snapshot** of the live page. After deploys, spot-check hero, metrics, footer CTAs, and external links for copy/URL drift.
