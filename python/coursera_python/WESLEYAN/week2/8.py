def problem2_8(temp_list):
    max = temp_list[0]
    min = temp_list[0]
    sum = 0
    for item in temp_list:
        if item > max:
            max = item
        if item < min:
            min = item
        sum = sum + item
    avg = sum/len(temp_list)
    print("Average:",avg)
    print("High:",max)
    print("Low:",min)
    pass # replace this pass (a do-nothing) statement with your code
        
    
