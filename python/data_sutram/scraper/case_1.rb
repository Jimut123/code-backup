# Determines US generation names based on birth year
# ===  | Like switch case in any other programming languages!
birthyear = gets.to_i
print "birthyear = #{birthyear}\n"
generation = case birthyear
    when 1946..1963 then "Baby Boomer" 
    when 1964..1976 then "Generation X" 
    when 1978..2000 then "Generation Y" 
    else "Not sure!"
    end
print "#{generation}\n"
