""" combinatorics.py

OVERVIEW
========

This module was created to supplement Python's itertools module, filling in gaps
in the following areas of basic combinatorics:

(A) ordered and unordered m-way combinations,

(B) generalizations of the four basic occupancy problems ('balls in boxes'), and

(C) constrained permutations, otherwise known as the 'off-by-m' problem.

Brief descriptions of the included functions and classes follow (more detailed
descriptions and additional examples can be found in the individual doc strings
within the functions):

n_choose_m(n, m): calculate n-choose-m, using a simple algorithm that is less
likely to involve large integers than the direct evaluation of n! / m! / (n-m)!

m_way_ordered_combinations(items, ks): This function returns a generator that
produces all m-way ordered combinations (multinomial combinations) from the
specified collection of items, with ks[i] items in the ith group, i= 0, 1, 2,
..., m-1, where m= len(ks) is the number of groups.  'Ordered combinations'
means that the relative order of equal- size groups is important; the order of
the items within any group is not important.  The total number of combinations
generated is given by the multinomial coefficient formula (see
http://en.wikipedia.org/wiki/Multinomial_theorem#Multinomial_coefficients).

m_way_unordered_combinations(items, ks): This function returns a generator that
produces all m-way unordered combinations from the specified collection of
items, with ks[i] items in the ith group, i= 0, 1, 2, ..., m-1, where m= len(ks)
is the number of groups.  'Unordered combinations' means that the relative order
of equal-size groups is not important.  The order of the items within any group
is also unimportant.

Example of `m_way_unordered_combinations`::

   Issue the following statement from the IPython prompt:

   from combinatorics import *
   list(m_way_unordered_combinations(6,[2,2,2]))

   The output consists of the 15 combinations listed below:

   (0, 1), (2, 3), (4, 5)
   (0, 1), (2, 4), (3, 5)
   (0, 1), (2, 5), (3, 4)
   (0, 2), (1, 3), (4, 5)
   (0, 2), (1, 4), (3, 5)
   (0, 2), (1, 5), (3, 4)
   (0, 3), (1, 2), (4, 5)
   (0, 3), (1, 4), (2, 5)
   (0, 3), (1, 5), (2, 4)
   (0, 4), (1, 2), (3, 5)
   (0, 4), (1, 3), (2, 5)
   (0, 4), (1, 5), (2, 3)
   (0, 5), (1, 2), (3, 4)
   (0, 5), (1, 3), (2, 4)
   (0, 5), (1, 4), (2, 3)

unlabeled_balls_in_labeled_boxes(balls, box_sizes): This function returns a
generator that produces all distinct distributions of indistinguishable balls
among labeled boxes with specified box sizes (capacities). This is a
generalization of the most common formulation of the problem, where each box is
sufficiently large to accommodate all of the balls, and is an important example
of a class of combinatorics problems called 'weak composition' problems.

unlabeled_balls_in_unlabeled_boxes(balls, box_sizes): This function returns a
generator that produces all distinct distributions of indistinguishable balls
among indistinguishable boxes, with specified box sizes (capacities). This is a
generalization of the most common formulation of the problem, where each box is
sufficiently large to accommodate all of the balls. It might be asked, 'In what
sense are the boxes indistinguishable if they have different capacities?' The
answer is that the box capacities must be considered when distributing the
balls, but once the balls have been distributed, the identities of the boxes no
longer matter.

Example of `unlabeled_balls_in_unlabeled_boxes`::

   Issue the following commands from the IPython prompt:

   from combinatorics import *
   list(unlabeled_balls_in_unlabeled_boxes(10,[5,4,3,2,1]))

   The output is as follows:

   [(5, 4, 1, 0, 0),
    (5, 3, 2, 0, 0),
    (5, 3, 1, 1, 0),
    (5, 2, 2, 1, 0),
    (5, 2, 1, 1, 1),
    (4, 4, 2, 0, 0),
    (4, 4, 1, 1, 0),
    (4, 3, 3, 0, 0),
    (4, 3, 2, 1, 0),
    (4, 3, 1, 1, 1),
    (4, 2, 2, 2, 0),
    (4, 2, 2, 1, 1),
    (3, 3, 3, 1, 0),
    (3, 3, 2, 2, 0),
    (3, 3, 2, 1, 1),
    (3, 2, 2, 2, 1)]

labeled_balls_in_unlabeled_boxes(balls, box_sizes): This function returns a
generator that produces all distinct distributions of distinguishable balls
among indistinguishable boxes, with specified box sizes (capacities). This is a
generalization of the most common formulation of the problem, where each box is
sufficiently large to accommodate all of the balls.

labeled_balls_in_labeled_boxes(balls, box_sizes): This function returns a
generator that produces all distinct distributions of distinguishable balls
among distinguishable boxes, with specified box sizes (capacities). This is a
generalization of the most common formulation of the problem, where each box is
sufficiently large to accommodate all of the balls.

Example of `labeled_balls_in_labeled_boxes`::

   Issue the following statements from the IPython prompt:

   from combinatorics import *
   list(labeled_balls_in_labeled_boxes(3,[2,2]))

   The output is as follows:

   [((0, 1), (2,)),
    ((0, 2), (1,)),
    ((1, 2), (0,)),
    ((0,), (1, 2)),
    ((1,), (0, 2)),
    ((2,), (0, 1))]

partitions(n): 'In number theory and combinatorics, a partition of a positive
integer n, also called an integer partition, is a way of writing n as a sum of
positive integers. Two sums that differ only in the order of their summands are
considered to be the same partition.'  The quote is from
http://en.wikipedia.org/wiki/Partition_(number_theory).  We can generate all
partitions of an integer using `unlabeled_balls_in_unlabeled_boxes`.

off_by_one(n): This function returns a generator that enumerates all possible
solutions of the 'off-by-one' problem.  This problem can be stated as follows::

   A list of n items is provided.  Each item is in its correct position, or
   one before or one after its correct position.  Enumerate all possibilities
   for the correct ordering.

(These are essentially constrained permutations). With two lines of code, one
can generate a table showing the number of possible permutations versus n::

   for i in range(2,10):
      print('%d, %d' % (i, len(list(off_by_one(i))))

The output is as follows::

     2, 2
     3, 3
     4, 5
     5, 8
     6, 13
     7, 21
     8, 34
     9, 55

Note that the number of possible orders follows the Fibonacci sequence.

off_by_m(n, m): This recursive generator function enumerates all possible
solutions of the 'off-by-m' problem.  This problem, which is a generalization of
the off-by-one problem, can be stated as follows::

   A list of n items is provided.  Each item is in its correct position, or up
   to m positions before or after its correct position.  Enumerate all
   possibilities for the correct ordering.  (Conceptually, changing one order to
   another is done by exchanging elements pairwise; any number of such exchanges
   may be performed; we care only about the initial and final lists--not the
   sequence of operations that transformed one into the other).


AUTHOR
======

Dr. Phillip M. Feldman

Comments and suggestions--especially bug reports--can be communicated to me via
the following e-mail address: Phillip.M.Feldman@gmail.com


REVISION HISTORY
================


02-07-2015, version 1.4.5, Phillip M. Feldman:

(minor) I fixed a bug in `m_way_unordered_combinations` that was causing the
generator to sometimes return an incomplete list of combinations.  I'd like to
acknowledge Dr. Jose Maria Escartin Esteban of the Cavendish Laboratory,
U. Cambridge, UK, who brought this error to my attention.


11-05-2014, version 1.4.4, Phillip M. Feldman:

(minor) I eliminated the dependence on NumPy by using Python's builtin `sorted`
function instead of `numpy.sort`.


11-02-2014, version 1.4.3, Phillip M. Feldman:

(minor) I patched the four balls-in-boxes generators to make them accept box
sizes specified via either a list or a tuple.

(minor) I added a missing import for `gammaln`.  Thanks to Tomi Silander for
catching this.

(minor) I patched the `prod` function to make it handle the case where the
input sequence is empty by returning the value 1.


11-04-2013, version 1.4.2, Phillip M. Feldman:

(minor+) A serious bug in `m_way_unordered_combinations` (the same bug affects
`m_way_ordered_combinations`) was identified by Jeffrey Rosenberg of Dorset
Connects.  I was having a hard time diagnosing the bug because it manifested
itself only for moderately large cases.  Robert Kern of Enthought provided the
solution: 'You are doing an ordered comparison between tuples that come out of
itertools.combinations().  The order of the elements in the output tuples is
relative to the order of the elements specified in the input.  You are passing a
set, which has an arbitrary order.  Sort `items_remaining` into a list (so that
it has a deterministic order) before passing it to the recursive instance.'


08-28-2012, version 1.4.1, Phillip M. Feldman:

(minor) I implemented a bug fix in `off_by_m_algorithm3`: One must copy the
result before yielding it to the calling program; otherwise, the same object is
being re-used.  This bug fix was contributed by Corran Webster of Enthought.


08-26-2012, version 1.4.0, Phillip M. Feldman:

(minor/intermediate) I added three algorithms that solve the off-by-m problem.
The first, which is the slowest, and the last, which is the fastest, were
written by me.  The second was contributed by Warren Weckesser of Enthought.


08-10-2012, version 1.3.0, Phillip M. Feldman:

(minor+) I incorporated a patch contributed by David Hollman
(david.s.hollman@gmail.com).  This patch corrects a serious flaw in the
generator function `_m_way_unordered_combinations`, which is used by
`m_way_unordered_combinations` and by `labeled_balls_in_unlabeled_boxes`.
Without the patch, `labelled_balls_in_unlabeled_boxes` misses some valid
combinations.

(minor/intermediate) I added the function `off_by_one`, which returns a
generator that enumerates all possible solutions of the 'off-by-one' problem.


04-06-2012, version 1.2.0, Phillip M. Feldman:

I added the function `prod`, which is similar to `numpy.prod` but does all
calculations using large arithmetic when operating on a sequence of integers.

I fixed a bug in `n_choose_m`: We must force the division to be done using
integer arithmetic because otherwise Python attempts to convert the results from
`prod` into floating point numbers, which can fail for n greater than 170.

I added the function `n_choose_m_ln`.  This function calculates the natural
logarithm of choose(n,m), defined as the number of ways in which one can select
m of n distinct objects without regard for order, using SciPy's `gammaln`
function.  For large n, especially for n > 10000, this function is much faster
than `n_choose_m` (computational and memory requirements are both much lower).


10-09-2011, version 1.1.1, Phillip M. Feldman:

I added a function to generate partitions.


10-01-2011, version 1.1.0, Phillip M. Feldman:

I added input error checking to the `labeled_balls_in_unlabeled_boxes` function.

I fixed the function `m_way_ordered_combinations` so that the box order
specified via the input argument `ks` is respected.

I added the function `labeled_balls_in_labeled_boxes`.  This completes the basic
set of functions for solving occupancy functions with capacity limits.

09-24-2011: Initial version.
"""


import collections, copy, itertools, math, operator

try:
   from scipy.special import gammaln
except:
   pass

try:
   from miscellaneous import Timer
except:
   pass

# Define `fact` as a shorthand name for the `factorial` function:
fact= math.factorial


def prod(seq):
   """
   OVERVIEW

   This function, like NumPy's `prod` function, calculates the product of a
   sequence of integers (typically specified via a list or tuple).  Because the
   NumPy function uses 32-bit integer arithmetic with silent handling of
   overflows, results are wrong if the correct answer would exceed the limits of
   a signed 32-bit integer.  When operating on a sequence of integers, the
   `prod` function defined in this module uses large integer arithmetic and thus
   always gives correct results.


   EXAMPLE

   In [1]: prod(range(1,11))
   Out[1]: 3628800

   In [2]: prod(range(1,31))
   Out[2]: 1409286144

   In [3]: from combinatorics import prod

   In [4]: prod(range(1,11))
   Out[4]: 3628800

   In [5]: prod(range(1,31))
   Out[5]: 265252859812191058636308480000000L
   """
   if not seq:
      return 1

   return reduce(operator.mul, seq)


def n_choose_m(n, m):
   """
   OVERVIEW

   This function calculates choose(n,m), defined as the number of ways in which
   one can select m of n distinct objects without regard for order.  The
   function uses only integer arithmetic:

   1. If m > n-m, we replace m by n-m.

   2. We calculate the answer by evaluating

      prod(range(n-m+1,n+1)) / prod(range(2,m+1)),

   which is equivalent to

      n! / m! / (n-m)!


   NOTE

   Python can handle integers of arbitrary size, but the algorithm tends to bog
   down for very large values of n, partly because of the number of operations
   being performed and partly because of the memory requirements.  For values of
   n above about 10000, use `m_choose_n_ln` instead of `m_choose_n`.
   """

   if not isinstance(n, int) or not isinstance(m, int):
      raise TypeError('The inputs n and m must have type int.')

   if m < 0 or m > n:
      raise ValueError("m (the second argument) must be between 0 and n, "
        "inclusive.")

   if m > n-m: m= n-m

   if m == 0:
      return 1
   elif m == 1:
      return n

   # In the following statement, we force the division to be done using integer
   # arithmetic because otherwise Python attempts to convert the results from
   # `prod` into floating point numbers, which can fail for n greater than 170.
   return prod(range(n-m+1,n+1)) // prod(range(2,m+1))


def n_choose_m_ln(n, m):
   """
   OVERVIEW

   This function calculates the natural logarithm of choose(n,m), defined as the
   number of ways in which one can select m of n distinct objects without regard
   for order, using SciPy's `gammaln` function.  For large n, especially for
   n > 10000, this function is much faster than `n_choose_m` (computational and
   memory requirements are both much lower).


   NOTE

   To obtain a value for choose(n,m), apply the `exp` function to the result
   returned by this function.

   This function works for huge values of `n`, but applying `exp` to the return
   value may produce an overflow.
   """

   return gammaln(n+1) - gammaln(m+1) - gammaln(n-m+1)


def m_way_ordered_combinations(items, ks):
   """
   OVERVIEW

   This function returns a generator that produces all m-way ordered
   combinations (multinomial combinations) from the specified collection of
   items, with ks[i] items in the ith group, i= 0, 1, 2, ..., m-1, where m=
   len(ks) is the number of groups.  'Ordered combinations' means that the
   relative order of equal-size groups is important.  The order of the items
   within any group is not important.  The total number of combinations
   generated is given by the multinomial coefficient formula (see below).


   INPUTS

   `items` must be (A) a list, tuple, or other iterable, or (B) a positive
   integer.  If `items` is an integer, it is replaced by `range(items)`.

   `ks` should be either a list or tuple containing non-negative integers, where
   the sum of these integers does not exceed the length of `items`.


   EXAMPLE

   Let items=[0,1,2,3,4,5] and ks=[2,2,2].  The output includes a total of 90
   combinations.  Two of these are the following:

   ((0, 1), (2, 3), (4, 5))
   ((2, 3), (0, 1), (4, 5))

   These are distinct because the order of the groups, which differs, is
   significant.


   NOTES

   The total number of combinations generated is given by the following
   multinomial coefficient:

                n!
   ----------------------------
   k_0! * k_1! * ... * k_(m-1)!

   where n is the number of items, m is the number of groups, and k_i is the
   number of items in the ith group.
   """
   if isinstance(items, int):
      items= range(items)
   elif not isinstance(items,collections.Iterable):
      raise TypeError("`items` must be a list, tuple, or other iterable.")

   if not isinstance(ks, (list, tuple)) or len(ks) == 0:
      raise TypeError("`ks` must be a non-empty list or tuple.")

   return _m_way_ordered_combinations(items, ks)

# end def m_way_ordered_combinations


def _m_way_ordered_combinations(items, ks):

   if len(ks) == 1:
      for c in itertools.combinations(items, ks[0]):
         yield (c,)

   else:
      for c_first in itertools.combinations(items, ks[0]):

         # Because sets have arbitrary/non-deterministic order, we sort
         # `items_remaining` into a list before passing it to the recursive
         # instance of `_m_way_unordered_combinations()`:
         items_remaining= sorted(set(items) - set(c_first))

         for c_other in _m_way_ordered_combinations(items_remaining, ks[1:]):
            yield (c_first,) + c_other

# end def _m_way_ordered_combinations(items, ns)


def m_way_unordered_combinations(items, ks):
   """
   OVERVIEW

   This function returns a generator that produces all m-way unordered
   combinations from the specified collection of items, with ks[i] items in the
   ith group, i= 0, 1, 2, ..., m-1, where m= len(ks) is the number of groups.
   'Unordered combinations' means that the relative order of equal-size groups
   is not important.  The order of the items within any group is also
   unimportant.


   INPUTS

   `items` must be (A) a list, tuple, or other iterable, or (B) a positive
   integer.  If `items` is an integer, it is replaced by `range(items)`.

   `ks` should be either a list or tuple containing non-negative integers, where
   the sum of these integers does not exceed the length of `items`.


   EXAMPLE

   Issue the following statement at the IPython prompt:

   list(m_way_unordered_combinations(6, [2,2,2]))

   The output consists of the 15 combinations listed below:

   (0, 1), (2, 3), (4, 5)
   (0, 1), (2, 4), (3, 5)
   (0, 1), (2, 5), (3, 4)
   (0, 2), (1, 3), (4, 5)
   (0, 2), (1, 4), (3, 5)
   (0, 2), (1, 5), (3, 4)
   (0, 3), (1, 2), (4, 5)
   (0, 3), (1, 4), (2, 5)
   (0, 3), (1, 5), (2, 4)
   (0, 4), (1, 2), (3, 5)
   (0, 4), (1, 3), (2, 5)
   (0, 4), (1, 5), (2, 3)
   (0, 5), (1, 2), (3, 4)
   (0, 5), (1, 3), (2, 4)
   (0, 5), (1, 4), (2, 3)


   NOTES

   When all group sizes are unequal, the total number of combinations generated
   is given by the multinomial coefficient (see above).  When two or more groups
   have equal sizes, the number of combinations is less than the multinomial
   coefficient because combinations that differ only in the relative order of
   equal-size groups are excluded.
   """
   if isinstance(items, int):
      items= range(items)
   elif not isinstance(items, collections.Iterable):
      raise TypeError("`items` must be a list, tuple, or other iterable.")

   if not isinstance(ks, (list, tuple)) or len(ks) == 0:
      raise TypeError("`ks` must be a non-empty list or tuple.")

   # Sort group sizes from largest to smallest:
   ks= sorted(ks, reverse=True)

   # Call the recursive generator function, passing it a sorted version of
   # `items` so that the equivalence test (see comment below) will work.
   return _m_way_unordered_combinations(sorted(items), ks)

# end def m_way_unordered_combinations


def _m_way_unordered_combinations(items, ks):
   """
   This recursive generator function does the real work of generating unordered
   combinations.  See the doc string for the `m_way_unordered_combinations`
   above.
   """

   if not any(ks[1:]):

      # Not counting any zeros at the end, `ks` has length 1.  ==> M-way
      # combination has degenerated to a 2-way combination.  Generate tuples
      # from `itertools.combinations`, tacking on empty items corresponding to
      # any zeros at the end of `ks`.
      for c in itertools.combinations(items, ks[0]):
         yield (c,) + ((),) * (len(ks) - 1)

   else:

      # Recursively decompose M-way combination into a 2-way combination
      # followed by an (M-1)-way combination.
      for c_first in itertools.combinations(items, ks[0]):

         # Because sets have arbitrary/non-deterministic order, we sort
         # `items_remaining` into a list before passing it to the recursive
         # instance of `_m_way_unordered_combinations()`:
         items_remaining= sorted(set(items) - set(c_first))

         for c_other in \
           _m_way_unordered_combinations(items_remaining, ks[1:]):

            # Test for equivalence: If `c_first` and `c_other` have the same
            # lengths and `c_first` is less than `c_other[0]`, this combination
            # is equivalent to one that has already been returned to the caller
            # and should therefore be skipped.
            if len(c_first)!=len(c_other[0]) or c_first<c_other[0]:
               yield (c_first,) + c_other

# end def _m_way_unordered_combinations(items, ns)


def unlabeled_balls_in_labeled_boxes(balls, box_sizes):
   """
   OVERVIEW

   This function returns a generator that produces all distinct distributions of
   indistinguishable balls among labeled boxes with specified box sizes
   (capacities).  This is a generalization of the most common formulation of the
   problem, where each box is sufficiently large to accommodate all of the
   balls, and is an important example of a class of combinatorics problems
   called 'weak composition' problems.


   CONSTRUCTOR INPUTS

   n: the number of balls

   box_sizes: This argument is a list of length 1 or greater.  The length of
   the list corresponds to the number of boxes.  `box_sizes[i]` is a positive
   integer that specifies the maximum capacity of the ith box.  If
   `box_sizes[i]` equals `n` (or greater), the ith box can accommodate all `n`
   balls and thus effectively has unlimited capacity.


   ACKNOWLEDGMENT

   I'd like to thank Chris Rebert for helping me to convert my prototype
   class-based code into a generator function.
   """
   if not isinstance(balls, int):
      raise TypeError("balls must be a non-negative integer.")
   if balls < 0:
      raise ValueError("balls must be a non-negative integer.")

   if not isinstance(box_sizes, (list, tuple)):
      raise ValueError("box_sizes must be a non-empty list or tuple.")

   capacity= 0
   for size in box_sizes:
      if not isinstance(size, int):
          raise TypeError("box_sizes must contain only positive integers.")
      if size < 1:
          raise ValueError("box_sizes must contain only positive integers.")
      capacity+= size

   if capacity < balls:
      raise ValueError("The total capacity of the boxes is less than the "
        "number of balls to be distributed.")

   return _unlabeled_balls_in_labeled_boxes(balls, box_sizes)


def _unlabeled_balls_in_labeled_boxes(balls, box_sizes):
   """
   This recursive generator function was designed to be returned by
   `unlabeled_balls_in_labeled_boxes`.
   """

   # If there are no balls, all boxes must be empty:
   if not balls:
      yield len(box_sizes) * (0,)

   elif len(box_sizes) == 1:

      # If the single available box has sufficient capacity to store the balls,
      # there is only one possible distribution, and we return it to the caller
      # via `yield`.  Otherwise, the flow of control will pass to the end of the
      # function, triggering a `StopIteration` exception.
      if box_sizes[0] >= balls:
          yield (balls,)

   else:

      # Iterate over the number of balls in the first box (from the maximum
      # possible down to zero), recursively invoking the generator to distribute
      # the remaining balls among the remaining boxes.
      for balls_in_first_box in xrange( min(balls, box_sizes[0]), -1, -1 ):
         balls_in_other_boxes= balls - balls_in_first_box

         for distribution_other in _unlabeled_balls_in_labeled_boxes(
           balls_in_other_boxes, box_sizes[1:]):
            yield (balls_in_first_box,) + distribution_other

   # end three alternative blocks

# end def _unlabeled_balls_in_labeled_boxes(balls, box_sizes)


def unlabeled_balls_in_unlabeled_boxes(balls, box_sizes):
   """
   OVERVIEW

   This function returns a generator that produces all distinct distributions of
   indistinguishable balls among indistinguishable boxes, with specified box
   sizes (capacities).  This is a generalization of the most common formulation
   of the problem, where each box is sufficiently large to accommodate all of
   the balls.  It might be asked, 'In what sense are the boxes indistinguishable
   if they have different capacities?' The answer is that the box capacities
   must be considered when distributing the balls, but once the balls have been
   distributed, the identities of the boxes no longer matter.


   CONSTRUCTOR INPUTS

   n: the number of balls

   box_sizes: This argument is a list of length 1 or greater.  The length of
   the list corresponds to the number of boxes.  `box_sizes[i]` is a positive
   integer that specifies the maximum capacity of the ith box.  If
   `box_sizes[i]` equals `n` (or greater), the ith box can accommodate all `n`
   balls and thus effectively has unlimited capacity.


   NOTE

   For `unlabeled_balls_in_unlabeled_boxes`, the order of the elements of the
   `box_sizes` list is unimportant because the code will sort it into non-
   increasing order before any other processing is done.
   """
   if not isinstance(balls, int):
      raise TypeError("balls must be a non-negative integer.")
   if balls < 0:
      raise ValueError("balls must be a non-negative integer.")

   if not isinstance(box_sizes, (list, tuple)):
      raise ValueError("box_sizes must be a non-empty list or tuple.")

   capacity= 0
   for size in box_sizes:
      if not isinstance(size, int):
          raise TypeError("box_sizes must contain only positive integers.")
      if size < 1:
          raise ValueError("box_sizes must contain only positive integers.")
      capacity+= size

   if capacity < balls:
      raise ValueError("The total capacity of the boxes is less than the "
        "number of balls to be distributed.")

   # Sort the box sizes so that the values decrease:
   box_sizes= sorted(box_sizes, reverse=True)

   return _unlabeled_balls_in_unlabeled_boxes(balls, box_sizes)

# def unlabeled_balls_in_unlabeled_boxes(balls, box_sizes)


def _unlabeled_balls_in_unlabeled_boxes(balls, box_sizes):
   """
   This recursive generator function was designed to be returned by
   `unlabeled_balls_in_unlabeled_boxes`.
   """

   # If there are no balls, all boxes must be empty.
   if not balls:
      yield len(box_sizes) * (0,)

   elif len(box_sizes) == 1:

      # If the single available box has sufficient capacity to store the balls,
      # there is only one possible distribution, and we return it to the caller
      # via `yield`.  Otherwise, the flow of control will pass to the end of the
      # generator function, triggering a `StopIteration` exception.
      if box_sizes[0] >= balls:
          yield (balls,)

   else:

      # Iterate over the number of balls in the first box (from the maximum
      # possible down to zero), recursively invoking the generator to distribute
      # the remaining balls among the remaining boxes.
      for balls_in_first_box in xrange( min(balls, box_sizes[0]), -1, -1 ):
         balls_in_other_boxes= balls - balls_in_first_box

         for distribution_other in _unlabeled_balls_in_unlabeled_boxes(
           balls_in_other_boxes, box_sizes[1:]):

            # To prevent the possibility of duplicating a distribution that has
            # been obtained previously, we require that the number of balls in
            # the second box (first of the 'other' boxes) not exceed the number
            # of balls in the first box:
            if distribution_other[0] <= balls_in_first_box:
               yield (balls_in_first_box,) + distribution_other

   # end three alternative blocks

# def _unlabeled_balls_in_unlabeled_boxes(balls, box_sizes)


def labeled_balls_in_unlabeled_boxes(balls, box_sizes):
   """
   OVERVIEW

   This function returns a generator that produces all distinct distributions of
   distinguishable balls among indistinguishable boxes, with specified box sizes
   (capacities).  This is a generalization of the most common formulation of the
   problem, where each box is sufficiently large to accommodate all of the
   balls.  It might be asked, 'In what sense are the boxes indistinguishable if
   they have different capacities?'  The answer is that the box capacities must
   be considered when distributing the balls, but once the balls have been
   distributed, the identities of the boxes no longer matter.


   CONSTRUCTOR INPUTS

   n: the number of balls

   box_sizes: This argument is a list of length 1 or greater.  The length of
   the list corresponds to the number of boxes.  `box_sizes[i]` is a positive
   integer that specifies the maximum capacity of the ith box.  If
   `box_sizes[i]` equals `n` (or greater), the ith box can accommodate all `n`
   balls and thus effectively has unlimited capacity.


   NOTE

   For `labeled_balls_in_unlabeled_boxes`, the order of the elements of the
   `box_sizes` list is unimportant because the code will sort it into non-
   increasing order before any other processing is done.
   """
   if not isinstance(balls, int):
      raise TypeError("balls must be a non-negative integer.")
   if balls < 0:
      raise ValueError("balls must be a non-negative integer.")

   if not isinstance(box_sizes, (list, tuple)):
      raise ValueError("box_sizes must be a non-empty list or tuple.")

   capacity= 0
   for size in box_sizes:
      if not isinstance(size, int):
          raise TypeError("box_sizes must contain only positive integers.")
      if size < 1:
          raise ValueError("box_sizes must contain only positive integers.")
      capacity+= size

   if capacity < balls:
      raise ValueError("The total capacity of the boxes is less than the "
        "number of balls to be distributed.")

   for unlabeled_dist in unlabeled_balls_in_unlabeled_boxes(balls, box_sizes):
      for labeled_dist in \
        m_way_unordered_combinations(balls, unlabeled_dist):
         yield labeled_dist

# end def labeled_balls_in_unlabeled_boxes(balls, box_sizes)


def labeled_balls_in_labeled_boxes(balls, box_sizes):
   """
   OVERVIEW

   This function returns a generator that produces all distinct distributions of
   distinguishable balls among distinguishable boxes, with specified box sizes
   (capacities).  This is a generalization of the most common formulation of the
   problem, where each box is sufficiently large to accommodate all of the
   balls.


   CONSTRUCTOR INPUTS

   n: the number of balls

   box_sizes: This argument is a list of length 1 or greater.  The length of
   the list corresponds to the number of boxes.  `box_sizes[i]` is a positive
   integer that specifies the maximum capacity of the ith box.  If
   `box_sizes[i]` equals `n` (or greater), the ith box can accommodate all `n`
   balls and thus effectively has unlimited capacity.


   EXAMPLE

   Issue the following statement at the IPython prompt:

   list(labeled_balls_in_labeled_boxes(3,[2,2]))

   The output is as follows:

   [((0, 1), (2,)),
    ((0, 2), (1,)),
    ((1, 2), (0,)),
    ((0,), (1, 2)),
    ((1,), (0, 2)),
    ((2,), (0, 1))]
   """
   if not isinstance(balls, int):
      raise TypeError("balls must be a non-negative integer.")
   if balls < 0:
      raise ValueError("balls must be a non-negative integer.")

   if not isinstance(box_sizes, (list, tuple)):
      raise ValueError("box_sizes must be a non-empty list or tuple.")

   capacity= 0
   for size in box_sizes:
      if not isinstance(size, int):
          raise TypeError("box_sizes must contain only positive integers.")
      if size < 1:
          raise ValueError("box_sizes must contain only positive integers.")
      capacity+= size

   if capacity < balls:
      raise ValueError("The total capacity of the boxes is less than the "
        "number of balls to be distributed.")

   for unlabeled_dist in unlabeled_balls_in_labeled_boxes(balls, box_sizes):
      for labeled_dist in m_way_ordered_combinations(balls, unlabeled_dist):
         yield labeled_dist

# end def labeled_balls_in_labeled_boxes(balls, box_sizes)


def partitions(n):
   """
   'In number theory and combinatorics, a partition of a positive integer n,
   also called an integer partition, is a way of writing n as a sum of positive
   integers.  Two sums that differ only in the order of their summands are
   considered to be the same partition.'  The quote is from
   http://en.wikipedia.org/wiki/Partition_(number_theory).  We can generate all
   partitions of an integer using `unlabeled_balls_in_unlabeled_boxes`.

   Note: This is an inefficient method for generating partitions.  `partitions2`
   is more efficient.
   """

   _partitions= unlabeled_balls_in_unlabeled_boxes(n, n*[n])

   for _partition in _partitions:
      yield tuple([p for p in _partition if p])


def partitions2(n):
   """
   This function efficiently generates partitions of the specified integer; it
   was written by David Eppstein.
   """
   # base case of recursion: zero is the sum of the empty list
   if n == 0:
      yield []
      return

   # modify partitions of n-1 to form partitions of n
   for p in partitions2(n-1):
      yield [1] + p
      if p and (len(p) < 2 or p[1] > p[0]):
         yield [p[0] + 1] + p[1:]


def off_by_one(n):
   """
   OVERVIEW

   This function returns a generator that enumerates all possible solutions of
   the 'off-by-one' problem.  This constrained permutation problem can be stated
   as follows:

      A list of n items is provided.  Each item is in its correct position, or
      one before or one after its correct position.  Enumerate all possibilities
      for the correct ordering.


   EXAMPLE

   With two lines of code, one can generate a table showing the number of
   possible orders versus n:

     for i in range(2,10):
        print('%d, %d' % (i, len(list(off_by_one(i))))

   The output is as follows:

     2, 2
     3, 3
     4, 5
     5, 8
     6, 13
     7, 21
     8, 34
     9, 55

   Note that the number of possible orders follows the Fibonacci sequence.
   """

   Seq= range(n)
   return _off_by_one(Seq)


def _off_by_one(Seq):
   """
   This recursive generator function was designed to be returned by
   `off_by_one`.
   """

   if len(Seq) <= 1:
      yield Seq

   else:

      # There are two possibilities:

      # (1) The initial item of the list is in the correct position.
      Seq2= _off_by_one(Seq[1:])
      for seq2 in Seq2:
         yield [Seq[0]] + seq2

      # (2) The initial item must be switched with the item to the right of it.
      Seq2= _off_by_one(Seq[2:])
      for seq2 in Seq2:
         yield [Seq[1], Seq[0]] + seq2


def off_by_m_algorithm1(n, m):
   """
   OVERVIEW

   This generator function enumerates all possible solutions of the 'off-by-m'
   problem.  This constrained permutation problem can be stated as follows:

      A list of n items is provided.  Each item is within distance m of its
      correct position.  Enumerate all possibilities for the correct ordering.
      (Conceptually, changing one order to another is done by exchanging
      elements pairwise; any number of such exchanges may be performed; we care
      only about the initial and final lists--not the sequence of operations
      that transformed one into the other).
   """

   # 1. Build up list of lists of possible positions for the elements of the
   # original sequence:
   allowed_positions= []

   for i in range(n):
      allowed_positions.append( range( max(i-m,0), min(i+m+1,n)) )


   # 2. Iterate over all possible configurations, yielding all legal ones.
   for config in itertools.product(*allowed_positions):
      if len(set(config)) < n:
         continue
      yield config


def off_by_m_algorithm2(n, m):
   """
   This solution for the 'off-by-m' problem was contributed by Warren Weckesser
   of Enthought.
   """

   positions = allowed_positions(n, m)
   permutation = []
   return _off_by_m_aux_gen(n, m, positions, permutation)

def allowed_positions(n, m):
   positions = []
   for k in range(n):
      low = max(-k, -m)
      high = min(n - k - 1, m)
      positions.append(range(k + low, k + high + 1))
   return positions

def _off_by_m_aux_gen(n, m, positions, permutation):
   if len(positions) == 0:
       yield permutation
   else:
       for col in positions[0]:
           pos= copy.deepcopy(positions[1:])
           for j in range(min(len(pos), 2 * m)):
               if col in pos[j]:
                   pos[j].remove(col)
           for p in _off_by_m_aux_gen(n, m, pos, permutation + [col]):
               yield p


def off_by_m_algorithm3(n, m, seq=None, i=0):
   """
   OVERVIEW

   This recursive generator function enumerates all possible solutions of the
   'off-by-m' problem.  This constrained permutation problem can be stated as
   follows:

      A list of n items is provided.  Each item is within distance m of its
      correct position.  Enumerate all possibilities for the correct ordering.
      (Conceptually, changing one order to another is done by exchanging
      elements pairwise; any number of such exchanges may be performed; we care
      only about the initial and final lists--not the sequence of operations
      that transformed one into the other).
   """

   if i == 0:
      seq= n * [None]

   for j in range( max(i-m,0), min(i+m+1,n)):
      if seq[j] is not None:
         continue

      seq[j]= i

      if i >= n-1:
         yield copy.deepcopy(seq)
      else:
         for permutation in off_by_m(n, m, seq, i=i+1):
            yield permutation

      seq[j]= None


# Algorithm #3 is the fastest:
off_by_m= off_by_m_algorithm3


def off_by_m_test(n=12, m=2):
   """
   This function compares the run-time performances of three algorithms for the
   off-by-m problem.  Sample input and output appears below.

   off_by_m_test(12,2)

   Time for algorithm #1: 44.259 s
   Time for algorithm #2: 0.873 s
   Time for algorithm #3: 0.094 s
   """

   for algorithm in range(1,4):
      t= Timer()
      eval('len(list(off_by_m_algorithm%d(%d,%d)))' % (algorithm, n, m))
      print("Time for algorithm #%d: %s" % (algorithm, t.time()))
