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
/usr/bin/pbget --pull --aur-only python3-colorsysplus

pids=()

#################### Query trust before starting downloads. ####################
/usr/bin/bb-query_trust -l ./python3-colorsysplus AUR/python3-colorsysplus 1534773449 Xyne || exit 1

########### Download sources for package base python3-colorsysplus. ############
# Maintainer(s): Xyne
# Last modified: 2018-08-20 19:27:29 IST
# Repository: AUR
# Packages: python3-colorsysplus
pushd python3-colorsysplus
makepkg --verifysource --nodeps &
pids+=($!)
echo python3-colorsysplus ": $!"
popd

############### Wait for downloads and verifications to finish. ################
wait_pids "${pids[@]}"
