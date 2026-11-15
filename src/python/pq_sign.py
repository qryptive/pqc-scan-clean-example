"""Post-quantum signing and key exchange: ML-DSA-65 signatures, ML-KEM-768 key encapsulation."""
from pqcrypto.sign import ml_dsa_65
from pqcrypto.kem import ml_kem_768


def new_signing_key():
    return ml_dsa_65.generate_keypair()


def sign(secret_key, message: bytes) -> bytes:
    return ml_dsa_65.sign(secret_key, message)


def verify(public_key, message: bytes, signature: bytes) -> bool:
    try:
        ml_dsa_65.verify(public_key, message, signature)
        return True
    except Exception:
        return False


def new_kem_key():
    return ml_kem_768.generate_keypair()


def encapsulate(public_key):
    return ml_kem_768.encrypt(public_key)
