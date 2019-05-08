import json

a={

    "?": "oP\"Yb. \n\"'.dP' \n  8P   \n (8)   ",
    "@": " dP\"\"Yb  \ndP PY Yb \nYb boodP \n Ybooo   ",
    "A": "   db    \n  dPYb   \n dP__Yb  \ndP\"\"\"\"Yb ",
    "B": "88\"\"Yb \n88__dP \n88\"\"Yb \n88oodP ",
    "C": " dP\"\"b8 \ndP   `\" \nYb      \n YboodP ",
    "D": "8888b.  \n 8I  Yb \n 8I  dY \n8888Y\"  ",
    "E": "888888 \n88__   \n88\"\"   \n888888 ",
    "F": "888888 \n88__   \n88\"\"   \n88     ",
    "G": " dP\"\"b8 \ndP   `\" \nYb  \"88 \n YboodP ",
    "H": "88  88 \n88  88 \n888888 \n88  88 ",
}

#print(a)
get_c = []
for item in a:
    #print(a[item])
    c=0
    
    for char_ in a[item]:
        #print(char_)
        c = c + 1
        if char_=='\n':
            get_c.append(c)
            #print(c)
            c=0
max_c = max(get_c)  
print("max x = ",max_c)
"""
new_dict = {}
for item in a:
    print("ORIGINAL  = ",item,"\n",a[item])
    mx_c = 0
    make_ch = ""
    N_no = 0
    for char_ in a[item]:
        print(char_,end="")
        if char_ == '\n':
            N_no = N_no + 1
            if mx_c<max_c:
                # do
                k = max_c - mx_c
                print("k = ",k)
                for i in range(k):
                    make_ch=make_ch+"J"
            make_ch=make_ch+"\n"
            print("make_ch = ",make_ch)
        else:
            make_ch = make_ch+char_
            mx_c = mx_c + 1
    print("N_no found => ",N_no)
    print("\n-----------------------\n")
        
    new_dict[item] = make_ch
print(json.dumps(new_dict,indent=4,sort_keys=True))
"""
"""
for item in a:
    zip_ = ""
    now_c = 0
    for char_ in a[item]:
        if ord(char_) == 10:
            run_c = max_c - now_c
            for i in range(run_c-1):
                zip_ = zip_ + "J"
            zip_ = zip_ + "\n"
        else:
            zip_ = zip_ + char_
            now_c = now_c + 1
        
        print(ord(char_)," ",end="")
        if char_=="\n":
            print("\n")
            print("now_c =>",now_c)
            now_c=0
            print(zip_)
    print("\n")
"""
new_dict = {}
for item in a:
    
    get_life = a[item].split('\n')
    print(get_life)
    final_life = ""
    for it in get_life:
        print(it.rstrip())
        print(len(it.rstrip()))
        if len(it.rstrip())<max_c:
            final_it = it.rstrip()+' '*(max_c-len(it.rstrip())-1)+"\n"
            print(final_it)
            final_life = final_life + final_it
    print("----",len(final_life))
    new_dict[item]=final_life
print(json.dumps(new_dict,indent=4,sort_keys=True))
