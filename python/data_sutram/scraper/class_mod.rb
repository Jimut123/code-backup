"""
from <= x <= to
"""

class Sequence
    include Enumerable

    def initialize(from, to, by)
        @from, @to, @by = from, to, by
    end

    def each
        x = @from
        while x <= @to
            yeild x
            x += @by
        end
    end

    def length
        return 0 if @from > @to
        Integer((@to - @from)/@by) + 1
    end

    alias size length

    def[](index)
        return nil if index < 0
        v = @from + index*@by
        if v <= @to
            v
        else
            nil
        end
    end

    def *(factor)
        Sequence.new(@from*factor,@to*factor,@by*factor)
    end

    def +(offset)
        Sequence.new(@from+offset,@to+offset,@by)
    end
end

