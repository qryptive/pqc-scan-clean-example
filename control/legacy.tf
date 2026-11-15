resource "aws_kms_key" "legacy" {
  description              = "Classical signing key"
  key_usage                = "SIGN_VERIFY"
  customer_master_key_spec = "RSA_2048"
}
