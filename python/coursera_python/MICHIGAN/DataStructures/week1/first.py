#text = "X-DSPAM-Confidence:    0.8475";

text = "X-DSPAM-Confidence:    0.8475";
pos_col = text.find(':')
#print(pos_col)

len_str = len(text)
#print(len_str)

collect_str = text[pos_col+1:len_str]

#print(collect_str)

str_sp = collect_str.strip()

#print(str_sp)

float_no = float(str_sp)

print(float_no)

#print(float_no+1)
