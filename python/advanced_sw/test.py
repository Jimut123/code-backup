from jimner import jimner
import json
import os

if __name__ == "__main__":
    a = jimner()

    with open(a.__get_dir__()+'/fonts/data.json') as f:
        data = json.load(f)
    
    total_font_present = []
    for item in data:
        #print(item)
        total_font_present.append(item)
    FONTS_FAULT = []
    for font in total_font_present:
        try:
            list_ = a.get_banner_text(font,'Jimut')
            #print(list_)
            print(font ,"=> ")
            a.print_actual_banner(list_)
        except Exception as e:
            print(e)
            FONTS_FAULT.append([e,font])
    print("No. of FONTS fault : ",len(FONTS_FAULT))
    print(FONTS_FAULT)
