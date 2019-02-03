
# A method to ask user to confirm something

def are_you_sure?
    while true
        print "Are you sure? [y/n]:"
        response = gets
        case response
        when /^[yY]/ then
            return true
        when /^[nN]/, /^$/ then
            return false
        end
    end
end

get_resp = are_you_sure?
print "#{get_resp}\n"