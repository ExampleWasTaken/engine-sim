/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
/* eslint-disable @typescript-eslint/no-var-requires */
const fs = require('fs');
const { join } = require('path');

module.exports.buildString = () => {
  const HEAD = fs.readFileSync(join(__dirname, '../.git/HEAD'), { encoding: 'utf-8' }).split('/');
  const currentBranch = HEAD[HEAD.length - 1].trim();

  const commitSha = fs.readFileSync(join(__dirname, `../.git/refs/heads/${currentBranch}`), { encoding: 'utf-8' });

  return `${currentBranch}-${commitSha}`;
};
