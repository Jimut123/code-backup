#!/bin/bash
set -e

function run_hook_scripts()
{
  scriptdir="$1"
  shift 1
  if [[ -d $scriptdir ]]
  then
    shopt_nullglob="$(shopt -p nullglob)"
    shopt -s nullglob
    for script_ in "$scriptdir"/*
    do
      if [[ -x $script_ ]]
      then
        "$script_" "$@"
      fi
    done
    $shopt_nullglob
  fi
}

###################### Build package python3-colorsysplus ######################
# Maintainer(s): Xyne
# Last modified: 2018-08-20 19:27:29 IST
# Repository: AUR
# Package Base: python3-colorsysplus
pushd python3-colorsysplus
/usr/bin/bb-query_trust -l . AUR/python3-colorsysplus 1534773449 Xyne || exit 1
makepkgx -irs --pconfig /etc/pacman.conf --pkg python3-colorsysplus
pacman --config /etc/pacman.conf -T python3-colorsysplus || exit 1
popd
