// Post-quantum signing (ML-DSA-65) and key encapsulation (ML-KEM-768) with @noble/post-quantum.
import { ml_dsa65 } from '@noble/post-quantum/ml-dsa';
import { ml_kem768 } from '@noble/post-quantum/ml-kem';

export function newSigningKey() {
  return ml_dsa65.keygen();
}

export function sign(secretKey: Uint8Array, message: Uint8Array): Uint8Array {
  return ml_dsa65.sign(secretKey, message);
}

export function newKemKey() {
  return ml_kem768.keygen();
}
