
STRING.FORMAT() FORMAT SPECIFIERS REFERENCE
=============================================

COMMON FORMAT SPECIFIERS
------------------------
Type            Specifier   Example
Integer         %d          String.format("%d", 42) → "42"
Float/Double    %f          String.format("%.2f", 3.14159) → "3.14"
String          %s          String.format("%s", "hello") → "hello"
Character       %c          String.format("%c", 'A') → "A"
Boolean         %b          String.format("%b", true) → "true"
Hexadecimal     %x          String.format("%x", 255) → "ff"
Scientific      %e          String.format("%e", 1000.0) → "1.000000e+03"


EXAMPLES
--------

INTEGER (%d)
String.format("%d", 123);              → "123"
String.format("%5d", 123);             → "  123" (width 5, right-aligned)
String.format("%-5d", 123);            → "123  " (left-aligned)

FLOATING POINT (%f)
String.format("%f", 3.14);             → "3.140000"
String.format("%.2f", 3.14159);        → "3.14" (2 decimal places)
String.format("%8.2f", 3.14);          → "    3.14" (width 8, 2 decimals)

STRING (%s)
String.format("%s", "hello");          → "hello"
String.format("%10s", "hello");        → "     hello" (width 10)
String.format("%-10s", "hello");       → "hello     " (left-aligned)

CHARACTER (%c)
String.format("%c", 'A');              → "A"
String.format("%c", 65);               → "A" (ASCII value)

MULTIPLE VALUES
String.format("Name: %s, Age: %d, GPA: %.2f", "John", 20, 3.75);
→ "Name: John, Age: 20, GPA: 3.75"


MOST COMMONLY USED
------------------
%d  - integers
%f  - decimals
%s  - strings
%c  - characters


PHONE NUMBER EXAMPLE
--------------------
String.format("(%d%d%d) %d%d%d-%d%d%d%d", ...)  // using integers
String.format("(%c%c%c) %c%c%c-%c%c%c%c", ...)  // using characters
```