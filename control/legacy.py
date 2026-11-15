import hashlib
from cryptography.hazmat.primitives.asymmetric import rsa

def digest(data: bytes) -> str:
    return hashlib.md5(data).hexdigest()

def new_key():
    return rsa.generate_private_key(public_exponent=65537, key_size=2048)
