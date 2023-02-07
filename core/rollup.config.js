/* eslint-disable @typescript-eslint/no-var-requires */
const { join } = require('path');
const fs = require('fs');
const typescript = require('@rollup/plugin-typescript');
const nodeResolve = require('@rollup/plugin-node-resolve');
const replace = require('@rollup/plugin-replace');
const { buildString } = require('../scripts/buildMeta');

const extensions = ['.js', '.ts'];

const root = join(process.cwd());

module.exports = {
  input: join(root, 'core/index.ts'),
  plugins: [
    nodeResolve({ extensions }),
    typescript(),
    replace({
      preventAssignment: true,
      '__buildString': buildString(),
      '__buildDate': new Date(),
      '__appVersion': JSON.parse(fs.readFileSync('./package.json')).version,
    }),
  ],
  output: {
    file: join(root, 'out/core/core.js'),
    format: 'cjs',
  },
};
