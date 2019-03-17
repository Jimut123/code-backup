import argparse
parser = argparse.ArgumentParser()
parser.add_argument("-V","--version", help="displays version",
                    action="store_true")
args = parser.parse_args()

if args.version:
    print("version 0.0.8-beta Jimut (TM)")
