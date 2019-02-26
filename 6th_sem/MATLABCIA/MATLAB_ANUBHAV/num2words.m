function words = num2words(number)    
    %% integer part
    int_number = floor(number);
    words = int2words(int_number);
    %% digits after the decimal point
    if int_number ~= number
        %% base words
        namesDigits = {'zero', 'one', 'two', 'three', 'four', 'five', ...
                       'six', 'seven', 'eight', 'nine'};
        words = [words, ' point'];
        %% version 1: does not work due to numerical issues
        %while int_number ~= number
        %    number = (number-int_number) * 10;
        %    int_number = floor(number);
        %    words = [words, ' ', namesDigits{int_number+1}]; %#ok<AGROW>
        %end
        %% version 2: based on sprintf
        numStr = sprintf('%.18g', number);
        pointPos = find(numStr == '.');
        numStr = numStr(pointPos+1:end);
        for cIdx = 1:length(numStr)
            int_number = str2num(numStr(cIdx)); %#ok<ST2NM>
            words = [words, ' ', namesDigits{int_number+1}]; %#ok<AGROW>
        end
    end
end

%% 
% This function is implemented according to the modern British short scale
% standard dictionary numbers, cf.
%   http://en.wikipedia.org/wiki/English_numerals
%   http://en.wikipedia.org/wiki/Names_of_large_numbers
function words = int2words(number)
    %% base words
    minus     = 'minus';
    names0    = 'zero';
    names1000 = {'', ' thousand', ' million', ' billion', ' trillion', ...
                 ' quadrillion', ' quintillion', ' sextillion', ...
                 ' septillion', ' octillion', ' nonillion', ...
                 ' decillion', ' undecillion', ' duodecillion', ...
                 ' tredecillion', ' quattuordecillion', ...
                 ' quindecillion', ' sexdecillion', ' septendecillion', ...
                 ' ocotdecillion', ' novemdecillion', ' vigintillion'};

    %% sign    
    if number < 0
        isNegative = true;
        number = -number;
    elseif number == 0
        words = names0;
        return;
    else
        isNegative = false;
    end
    words = '';

    %% checks
    %maxCorrectNumber = 10^18...
    %maxDoableNumber = 10^63...
    %% convert
    cnt = 1;
    while number ~= 0
        num1000 = mod(number,1000);
        number = floor(number / 1000);
        if num1000 > 0
            if ~isempty(words)
                words = [',' words]; %#ok<AGROW>
            end        
            words = [' ' int2words_1to999(num1000), names1000{cnt}, words]; %#ok<AGROW>
        end
        cnt = cnt + 1;
        % check:
        if cnt == length(names1000) + 1
            error('The given number is too large for converting it into words');
        end
    end

    %% add sign
    if isNegative
        words = [minus, words];
    end

    %% trim <- can be removed by more clever whitespace handling inbetween?
    words = strtrim(words);
end

%% numbers between 1 and 999
function words = int2words_1to999(number)
    %% base words
    names1  = {'', 'one', 'two', 'three', 'four', 'five', 'six', ...
               'seven', 'eight', 'nine', 'ten', 'eleven', ...
               'twelve', 'thirteen', 'fourteen', 'fifteen', ...
               'sixteen', 'seventeen', 'eighteen', 'nineteen'};
    names10 = {'', 'twenty', 'thirty', 'forty', 'fifty', 'sixty', ...
               'seventy', 'eighty', 'ninety'};
    %% convert
    num100 = mod(number, 100);
    if num100 < 20
        words = names1{num100+1};
        number = (number - num100) / 100;
    else
        num10 = mod(number, 10);
        words = names1{num10+1};
        if ~isempty(words)
            words = ['-' words];
        end
        number = (number - num10) / 10;
        num10 = mod(number, 10);
        words = [names10{num10} words];
        number = (number - num10) / 10;
    end
    if number > 0
        if ~isempty(words)
            words = [' ', words];
        end
        words = [names1{number+1}, ' hundred', words];
    end
end