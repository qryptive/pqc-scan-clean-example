package control

import (
	"crypto/md5"
	"crypto/rand"
	"crypto/rsa"
)

func Digest(b []byte) [16]byte { return md5.Sum(b) }

func NewKey() (*rsa.PrivateKey, error) { return rsa.GenerateKey(rand.Reader, 2048) }
