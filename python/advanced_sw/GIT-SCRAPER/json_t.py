import json
a = {}



def f(n,l=1):
    if n==1: return l
    return {l:f(n-1,l+1)}

if __name__ == "__main__":
    #global a
    #print(f(9))
    print(json.dumps(f(9), indent=2, sort_keys=True))
    