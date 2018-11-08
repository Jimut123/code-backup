#!/usr/bin/env python

from distutils.core import setup

setup(name='Combinatorics',
      version='1.4.5',
      description='Basic Combinatorics Functions',
      author='Phillip M. Feldman',
      author_email='Phillip.M.Feldman@gmail.com',
      long_description="""
      This module was created to supplement Python's `itertools` module, filling
      in gaps in three areas of basic combinatorics: (A) ordered and unordered
      m-way combinations, (B) generalizations of the four basic occupancy
      problems ('balls in boxes'), and (C) sequences in which items are
      constrained to be within a specified distance of their initial location.
      """,
      py_modules=['Combinatorics'],
      url='http://phillipmfeldman.org/Python/for_developers.html',
)
