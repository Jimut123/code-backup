import argparse
parser = argparse.ArgumentParser()
parser.add_argument("-q","--quiet", help="will not display anything in the terminal",
                    action="store_true")
parser.add_argument("-t","--theme", help="to select theme [1] classic [2] light [3] dark",choices=[0, 1, 2],
                    type=int)
args = parser.parse_args()
if not args.quiet:
    print("NOT QUIET")
if args.theme == None:
    print("USING DEFAULT THEME")
else:
    print("THEME : ",args.theme)