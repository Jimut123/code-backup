#include "stdlib.h"
#include "stdio.h"
#include "math.h"

typedef struct {
   double x,y,z;
} XYZ;
typedef struct {
   XYZ p1,p2,p3;
} FACET3;

int CreateUnitSphere(int,FACET3 *);
XYZ MidPoint(XYZ,XYZ);
void Normalise(XYZ *);

int main(int argc,char **argv)
{
	int i;
	int n=7;
	FACET3 *f = NULL;

	f = malloc((int)pow(4,n) * sizeof(FACET3));
	n = CreateUnitSphere(n,f);
	fprintf(stderr,"%d facets generated\n",n);

	printf("solid\n");
	for (i=0;i<n;i++) {
		printf("facet normal 0 0 1\n");
		printf("outer loop\n");
		printf("vertex %g %g %g\n",f[i].p1.x,f[i].p1.y,f[i].p1.z);
      printf("vertex %g %g %g\n",f[i].p2.x,f[i].p2.y,f[i].p2.z);
      printf("vertex %g %g %g\n",f[i].p3.x,f[i].p3.y,f[i].p3.z);
		printf("endloop\n");
		printf("endfacet\n");
	}
	printf("endsolid");

	exit(0);
}

/*
	Create a unit sphere centered at the origin
	This code illustrates the concept rather than implements it efficiently
	The maximum number of facets produced is iterations * 3 (this is returned)
*/
int CreateUnitSphere(int iterations,FACET3 *facets)
{
	int i,j,n,nstart;
	XYZ p1 = {1.0,1.0,1.0},  p2 = {-1.0,-1.0,1.0};
	XYZ p3 = {1.0,-1.0,-1.0}, p4 = {-1.0,1.0,-1.0}; 
	Normalise(&p1);
	Normalise(&p2);
	Normalise(&p3);
	Normalise(&p4);

	facets[0].p1 = p1; facets[0].p2 = p2; facets[0].p3 = p3;
   facets[1].p1 = p2; facets[1].p2 = p1; facets[1].p3 = p4;
   facets[2].p1 = p2; facets[2].p2 = p4; facets[2].p3 = p3;
	facets[3].p1 = p1; facets[3].p2 = p3; facets[3].p3 = p4;

	n = 4;
	
	for (i=1;i<iterations;i++) {
		nstart = n;

		for (j=0;j<nstart;j++) {
			
			/* Create initially copies for the new facets */
			facets[n  ] = facets[j];
			facets[n+1] = facets[j];
			facets[n+2] = facets[j];

			/* Calculate the midpoints */
			p1 = MidPoint(facets[j].p1,facets[j].p2);
			p2 = MidPoint(facets[j].p2,facets[j].p3);
			p3 = MidPoint(facets[j].p3,facets[j].p1);

			/* Replace the current facet */
			facets[j].p2 = p1;
			facets[j].p3 = p3;

			/* Create the changed vertices in the new facets */
			facets[n  ].p1 = p1;
			facets[n  ].p3 = p2;
			facets[n+1].p1 = p3;
			facets[n+1].p2 = p2;
			facets[n+2].p1 = p1;
			facets[n+2].p2 = p2;
			facets[n+2].p3 = p3;
			n += 3;
		}
	}

	for (j=0;j<n;j++) {
		Normalise(&facets[j].p1);
		Normalise(&facets[j].p2);
		Normalise(&facets[j].p3);
	}

	return(n);
}

/*
   Return the midpoint between two vectors
*/
XYZ MidPoint(XYZ p1,XYZ p2)
{
   XYZ p;

   p.x = (p1.x + p2.x) / 2;
   p.y = (p1.y + p2.y) / 2;
   p.z = (p1.z + p2.z) / 2;

   return(p);
}

/*
   Normalise a vector
*/
void Normalise(XYZ *p)
{
   double length;

   length = sqrt(p->x * p->x + p->y * p->y + p->z * p->z);
   if (length != 0) {
      p->x /= length;
      p->y /= length;
      p->z /= length;
   } else {
      p->x = 0;
      p->y = 0;
      p->z = 0;
   }
}


