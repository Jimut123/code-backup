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

function wait_pids()
{
  for pid in "$@"
  do
    while [[ -e /proc/$pid ]]
    do
      #echo "waiting for $pid"
      sleep 0.5
    done
  done
}

####################### Get PKGBUILDS and related files. #######################
/usr/bin/pbget --pull --aur-only glew1.6

pids=()

#################### Query trust before starting downloads. ####################
/usr/bin/bb-query_trust -l ./glew1.6 AUR/glew1.6 1451645590 || exit 1

################## Download sources for package base glew1.6. ##################
# Maintainer(s): 
# Last modified: 2016-01-01 16:23:10 IST
# Repository: AUR
# Packages: glew1.6
pushd glew1.6
makepkg --verifysource --nodeps &
pids+=($!)
echo glew1.6 ": $!"
popd

############### Wait for downloads and verifications to finish. ################
wait_pids "${pids[@]}"
