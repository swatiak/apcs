package com.apcs.unit5;

public class Position
{
/** row and col are both >= 0 except in the default
* constructor where they are initialized to -1.
*/
private int row, col;
public Position() //constructor
{
row = -1;
col = -1;
}
public Position(int r, int c) //constructor
{
row = r;
col = c;
}
/** @return row of Position */
public int getRow()
{ return row; }
/** @return column of Position */
public int getCol()
{ return col; }
/** @return Position north of (up from) this position */
public Position north()
{ return new Position(row - 1, col); }
//Similar methods south, east, and west

/** Compares this Position to another Position object.
* @param p a Position object
* @return -1 (less than), 0 (equals), or 1 (greater than)
*/
public int compareTo(Position p)
{
if (this.getRow() < p.getRow() || this.getRow() == p.getRow()
&& this.getCol() < p.getCol())
return -1;
if (this.getRow() > p.getRow() || this.getRow() == p.getRow()
&& this.getCol() > p.getCol())
return 1;
return 0; //row and col both equal
}
/** @return string form of Position */
public String toString()
{ return "(" + row + "," + col + ")"; }
}

