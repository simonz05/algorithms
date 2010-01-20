algorithms
======
A repository for is207; a course on Algorithms and Data Structures 
at the University of Agder.

* Simple sorting.
* Simple searching.
* A few basic data structures.

Getting Started
---------------
*   `$ git clone git@github.com:simonz05/algorithms.git`
*   Use `$ make` to test different algorithms.
*   Storage; queue, linked-list etc. depends on [Go] (http://golang.org)
*   Sort & Search; Sorting algorithms currently have only C (gcc) deps.
    Searching test file is using [citrus] (http://github.com/simonz05/citrus). Both
    sorting and searching makefile depend on having citrus installed as
    shared lib.
         
    It's of course possible to build these algorithms without the citrus
    dependency.
  

License
-------
algorithms
Copyright (C) 2010  Simon Zimmermann

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
