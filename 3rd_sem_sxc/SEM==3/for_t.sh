#!/bin/sh
for i in {100..130}
do
  echo "downloading ... number $i"
  wget "https://hls2-l3.xnxx-cdn.com/c0be84cb901c0200f012fc387d3169efd0287d54-1570878473/videos/hls/27/01/33/270133d5e81faff34b5b4453bf5c8660/hls-360p$i.ts"
done

