r = 0.3;   // radius of fiber section
d = 16 ;   // diameter of one loop
loops = 2;
numbers = 10;
v = new Vec3 [loops*numbers];

for(j=0;j<loops;j++){
	for(i=0;i<numbers;i++){
  phi = (i/10)*2.0*Math.PI;
  v[j*10+i] = new Vec3(Math.cos(phi)*d/2, Math.sin(phi)*d/2, j*r*2);
  }
}  
  hair = new Tube(v, r,Tube.APPROXIMATING, Tube.OPEN_ENDS);
  script.addObject(hair, new CoordinateSystem());
