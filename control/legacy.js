const crypto = require('crypto');

function digest(data) {
  return crypto.createHash('md5').update(data).digest('hex');
}

function newKey() {
  return crypto.generateKeyPairSync('rsa', { modulusLength: 2048 });
}

module.exports = { digest, newKey };
