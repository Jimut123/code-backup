#include <stdio.h>
#include <stdlib.h>
#include <math.h>
/* Structures */
typedef struct
{
int rows; int cols; unsigned char* data;
} sImage;

/* Functions */
long getImageInfo(FILE*, long, int);
//long *compImage(long*, int , int );
void display(long*, int , int );
long convert(long);

int main(int argc, char * argv[])
{

FILE *bmpInput,*bmpOutput;
char signature[2]; /* Signature of the Image File BM = BMP */
int nRows, nCols; /* Row and Column size of the Image */
int xpixpeRm, ypixpeRm; /* Pixel/m */
long nColors; /* BMP number of colors */
long fileSize; /* BMP file size */
long vectorSize; /* BMP's raster data in number of bytes */
int nBits; /* # of BIts per Pixel */
int rasterOffset; /* Beginning of the Raster Data */
int i,j;
int nCharperPix; /* Number of character per pixel*/
long **imageMat,**compImagemat;

if(argc<2)
{
printf("Usage: %s bmpInput.bmp\n", argv[0]);
exit(0);
}
printf("Reading filename %s\n", argv[1]);

if ((bmpInput = fopen(argv[1], "rb")) == NULL)
{
printf("Can not read BMP file");
exit(0);
} /* Read BMP input file */


fseek(bmpInput, 0L, SEEK_SET); /* File pointer at byte #0 */


/* Signature of the File BM = BMP at byte # 0*/
 for(i=0; i<2;i++)
{
signature[i] = (char)getImageInfo(bmpInput, i, 1);
 printf("%c",signature[i]);
}
if ((signature[0] == 'B') && (signature[1] == 'M')) printf("It is verified that the Image is in Bitmap format\n");
else
{
printf("The image is not a bitmap format, quitting....\n");
exit(0);
}

/* Read BMP bits/pixel at byte #28 */
nBits = (int)getImageInfo(bmpInput, 28, 2);
nCharperPix= nBits/(sizeof(char)*8);
printf("The Image is \t%d-bit\n", nBits);

/* Position of First Raster Data at byte # 10*/
rasterOffset = (int)getImageInfo(bmpInput, 10, 4);
printf("The beginning of the Raster Data \nis at \t\t%d byte\n", rasterOffset);

/* Read BMP file size at byte # 2 */
fileSize = getImageInfo(bmpInput, 2, 4);
printf("File size is \t%ld byte\n", fileSize);

/* Read BMP width at byte #18 */
nCols = (int)getImageInfo(bmpInput, 18, 4);
printf("Width: \t\t%d\n", nCols);

/* Read BMP height at byte #22 */
nRows = (int)getImageInfo(bmpInput, 22, 4);
printf("Height: \t%d\n", nRows);

/* # of Pixels in a meter in x direction at byte # 38 */
xpixpeRm = (int)getImageInfo(bmpInput, 38, 4);
printf("Image has \t%d pixels per m in x-dir.\n", xpixpeRm);

/* # of Pixels in a meter in y direction at byte # 42 */
ypixpeRm = getImageInfo(bmpInput, 42, 4);
printf("Image has \t%d pixels per m in y-dir.\n", ypixpeRm);

/* Read number of colors at byte #46 */
nColors =(long)pow(2L,nBits);
printf("There are \t%ld number of Colors \n", nColors);

vectorSize = (long)((long)nCols*(long)nRows);
printf("Vector Size is \t%ld\n", vectorSize);

/*create the 2D array*/
imageMat=(long**)malloc(nRows*nCharperPix*sizeof(long*));
for(i=0;i<nRows;i++)
imageMat[i]=(long*)malloc(nCols*nCharperPix*sizeof(long));

bmpOutput = fopen(argv[2], "wb");
/*Read the image in the matrix*/

for(i=0;i<nRows;i++)
{
  for(j=0;j<nCols;j++)
  {  
    imageMat[i][j]= getImageInfo(bmpInput,rasterOffset+nCharperPix*(i*nCols+j),nCharperPix); //0 in the image is 1 in the matrix. Hence 0 is white pixel.

    fwrite(&imageMat[i][j], sizeof(imageMat[i][j]), 1,bmpOutput);
    }
 }
 
 printf("\nYour original image matrix is:");
//display(*imageMat,nRows,nCols);

compImagemat=(long**)malloc(nRows*nCharperPix*sizeof(long*));
for(i=0;i<nRows;i++)
compImagemat[i]=(long*)malloc(nCols*nCharperPix*sizeof(long));

 for(i=0;i<nRows;i++)
  {
    for (j=0;j<nCols;j++)
	{
      compImagemat[i][j]=convert(imageMat[i][j]);
    }
  }
 printf("\nYour complemented image matrix is:");
//display(*compImagemat,nRows,nCols);
fclose(bmpOutput);
fclose(bmpInput);
} /* end of main */


long getImageInfo(FILE* inputFile, long offset, int numberOfChars)
{
unsigned char *ptrC;
long value=0L;
unsigned char dummy;
int i;
dummy = '0'; ptrC = &dummy;
fseek(inputFile, offset, SEEK_SET);
for(i=1; i<=numberOfChars; i++)
{
  fread(ptrC, sizeof(char), 1, inputFile);
  value = (long)(value + (*ptrC)*(pow(256, (i-1))));
}
 return value;
}

long convert(long b)
{
int c[100];
long s=0;
int t,x,i;
t=0;
x=b;
while(x>0)
{
   c[t++]=x%9;
   x=x/9;
}
for(i=t-1;i>=0;i--)
s=(s*10)+c[i];
return s;
}

void display(long *imageMat, int rows, int cols)
{
 int i,j;
  for(i=0;i<rows;i++)
  {
    for (j=0;j<cols;j++)
      printf("%ld ",*((imageMat+i)+j)); 
	printf("\n");
   }   
 }
