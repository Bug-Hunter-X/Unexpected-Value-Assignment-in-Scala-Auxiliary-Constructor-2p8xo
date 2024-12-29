# Scala Auxiliary Constructor Bug

This repository demonstrates an uncommon error in Scala related to auxiliary constructors and the assignment of `val` parameters.  The code compiles without errors, but the final value of a `val` unexpectedly differs from the intended value due to the way auxiliary constructors and parameter assignment interact.

The bug is subtle and might not be immediately obvious to developers less familiar with Scala's nuances. The solution provides a clearer and more predictable approach.

## Setup

1.  Clone the repository.
2.  Make sure you have Scala installed.
3.  Compile and run the code in `Bug.scala` to see the unexpected behavior.
4.  Examine `BugSolution.scala` for the corrected code.