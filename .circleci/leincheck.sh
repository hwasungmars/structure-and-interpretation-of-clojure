#!/usr/bin/env bash
# -*- coding: utf8 -*-

# Author: Hwasung Lee

set -eu

SCRIPT_DIR=$(cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd)

line=$(lein check 2> >(grep -v Compiling) | wc -l)
exit "${line}"
