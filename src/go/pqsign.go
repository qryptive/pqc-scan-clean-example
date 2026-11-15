// Package clean signs with ML-DSA-65 and encapsulates with ML-KEM-768 using Cloudflare CIRCL.
package clean

import (
	"crypto/rand"

	"github.com/cloudflare/circl/kem/mlkem/mlkem768"
	"github.com/cloudflare/circl/sign/mldsa/mldsa65"
)

func NewSigningKey() (*mldsa65.PublicKey, *mldsa65.PrivateKey, error) {
	return mldsa65.GenerateKey(rand.Reader)
}

func NewKEMKey() (*mlkem768.PublicKey, *mlkem768.PrivateKey, error) {
	return mlkem768.GenerateKeyPair(rand.Reader)
}
