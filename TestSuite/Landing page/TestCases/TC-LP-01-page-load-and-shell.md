# TC-LP-01 — Page load and document shell

| ID | Title | Priority | Type | Preconditions | Steps | Expected result |
| --- | --- | --- | --- | --- | --- | --- |
| LP-001 | Landing loads successfully | P0 | Functional | Network available | 1. Open `https://jitu.one` in a clean session | HTTP 200; page renders without blocking error overlay |
| LP-002 | Page title matches brand | P1 | Content | LP-001 | 1. Observe browser tab / document title | Title reflects Jitu branding (e.g. contains “Jitu” and value proposition) |
| LP-003 | Favicon present | P2 | UI/UX | LP-001 | 1. Check tab favicon | Favicon loads (no broken icon) |
| LP-004 | Primary language / charset | P2 | Functional | LP-001 | 1. View page source or devtools | `lang` and charset appropriate; text renders correctly |
