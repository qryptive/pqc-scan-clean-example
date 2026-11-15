# An AWS KMS signing key that uses the post-quantum ML-DSA-65 algorithm.
resource "aws_kms_key" "signing" {
  description              = "Post-quantum signing key"
  key_usage                = "SIGN_VERIFY"
  customer_master_key_spec = "ML_DSA_65"
  enable_key_rotation      = false
}
