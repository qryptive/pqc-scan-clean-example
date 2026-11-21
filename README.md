# Qryptive scanner example: a post-quantum repository

Two folders, two claims:

- **`src/`** uses post-quantum algorithms only (ML-DSA-65 and ML-KEM-768) in Python, Java, Go,
  TypeScript and Terraform. The scanner reports **no vulnerable cryptography** there. It lists the
  post-quantum use it recognises as informational or "secure" entries, which are not warnings. It does
  not recognise the Go library used here, so the Go file produces no entries.
- **`control/`** holds one deliberately weak file per language (MD5 and RSA-2048, and an RSA KMS key
  in Terraform). The scanner must flag every one. This shows a clean result in `src/` is not
  because the scanner looked at nothing.

**See a result:** open the latest run in the [Actions tab](../../actions). The report is kept as
the artifact `qryptive-scan-report`.

The scan runs in the GitHub runner and sends nothing to Qryptive. What is sent, and when:
[qryptive.ai/privacy/scanner](https://qryptive.ai/privacy/scanner).

Scanner image used for the recorded run: `ghcr.io/qryptive/pqc-scanner@sha256:f3dd8cdb4fa6393ecbbf1b2ff10f500be8eb9072a8538ea38009ffd1feedf760`
