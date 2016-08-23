The chain of responsibility pattern is used to achieve loose-coupling in software design.
Client requests are passed to a chain of objects where each object decides itself who will be processing the request
and wheter the request is required to be sent to the next object in the chain or not.

In thix example we apply the pattern to build a virtual ATM dispense machine.