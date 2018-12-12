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

############################ Build package glew1.6 #############################
# Maintainer(s): 
# Last modified: 2016-01-01 16:23:10 IST
# Repository: AUR
# Package Base: glew1.6
pushd glew1.6
/usr/bin/bb-query_trust -l . AUR/glew1.6 1451645590 || exit 1
makepkgx -irs --pconfig /etc/pacman.conf --pkg glew1.6
pacman --config /etc/pacman.conf -T glew1.6 || exit 1
popd
