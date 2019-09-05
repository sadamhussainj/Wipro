String spos[] = input3.split("-");
        int px = Integer.parseInt(spos[0]);
        int py = Integer.parseInt(spos[1]);
        String dir = spos[2];
        String err = "";
        String inst[] = input4.split(" ");
        String fpos;
        for (int i = 0; i < inst.length; i++) 
        {
            String einst = inst[i];
            if (einst.equals("R"))
            {
                if (dir.equals("E")) 
                    dir = "S";
                else if (dir.equals("S")) 
                    dir = "W";
                else if (dir.equals("W")) 
                    dir = "N";
                else if (dir.equals("N")) 
                    dir = "E";
                else if (dir.equals("NE")) 
                    dir = "SE";
                else if (dir.equals("SE")) 
                    dir = "SW";
                else if (dir.equals("SW")) 
                    dir = "NW";
                else 
                    dir = "NE";
            }  
            if(einst.equals("r")) 
            {
                if (dir.equals("E")) 
                    dir = "SE";
                else if (dir.equals("SE")) 
                    dir = "S";
                else if (dir.equals("S")) 
                    dir = "SW";
                else if (dir.equals("SW"))
                    dir = "W";
                else if (dir.equals("W")) 
                    dir = "NW";
                else if (dir.equals("NW")) 
                    dir = "N";
                else if (dir.equals("N")) 
                    dir = "NE";
                else 
                    dir = "E";
            }
            if(einst.equals("L")) 
            {
                if (dir.equals("E")) 
                    dir = "N";
                else if(dir.equals("N")) 
                    dir = "W";
                else if(dir.equals("W")) 
                    dir = "S";
                else if(dir.equals("S")) 
                    dir = "E";
                else if(dir.equals("NE")) 
                    dir = "NW";
                else if(dir.equals("NW")) 
                    dir = "SW";
                else if(dir.equals("SW")) 
                    dir = "SE";
                else 
                    dir = "NE";
            }
            if(einst.equals("l")) 
            {
                if(dir.equals("E"))
                    dir = "NE";
                else if(dir.equals("NE"))
                    dir = "N";
                else if(dir.equals("N"))
                    dir = "NW";
                else if(dir.equals("NW")) 
                    dir = "W";
                else if(dir.equals("W")) 
                    dir="SW";
                else if(dir.equals("SW")) 
                    dir="S";
                else if(dir.equals("S")) 
                    dir="SE";
                else
                    dir="E";
            }
            if(einst.equals("M")) 
            {
                if(dir.equals("E"))
                {
                    px=px+2;
                    if(px>x)
                    {
                        px=px-2;
                        err="ER";
                        break;
                    }
                }
                else if(dir.equals("W"))
                {
                    px= px-2;
                    if(px<0)
                    {
                        px=px+2;
                        err="ER";
                        break;
                    }
                }
                else if(dir.equals("N")) 
                {
                    py=py+2;
                    if(py>y)
                    {
                        py=py-2;
                        err="ER";
                        break;
                    }
                }
                else if(dir.equals("S"))
                {
                    py= py-2;
                    if(py<0)
                    {
                        py=py+2;
                        err="ER";
                        break;
                    }
                }
                else if(dir.equals("NE"))
                {
                    py=py+2;
                    px=px+2;
                    if(py>y||px>x)
                    {
                        py=py-2;
                        px=px-2;
                        err="ER";
                        break;
                    }
                }
                else if(dir.equals("SE"))
                {
                    py=py-2;
                    px=px+2;
                    if(py<0||px>x)
                    {
                        py=py+2;
                        px=px-2;
                        err="ER";
                        break;
                    }        
                }
                else if (dir.equals("SW"))
                {
                    py=py-2;
                    px=px-2;
                    if(py<0||px<0)
                    {
                        py=py+2;
                        px=px+2;
                        err="ER";
                        break;
                    }
                }
                else
                {
                    py=py+2;
                    px=px-2;
                    if(py>y||px<0)
                    {
                        py=py-2;
                        px=px+2;
                        err="ER";
                        break;
                    }
                }   
            }
            if(einst.equals ("m")) 
            {
                if(dir.equals("E"))
                {
                    px=px+1;
                    if(px>x)
                    {
                        px=px-1;
                        err="ER";
                        break;
                    }
                }
                else if(dir.equals("W"))
                {
                    px= px-1;
                    if(px<0)
                    {
                        px=px+1;
                        err="ER";
                        break;
                    }
                }
                else if(dir.equals("N")) 
                {
                    py=py+1;
                    if(py>y)
                    {
                        py=py-1;
                        err="ER";
                        break;
                    }
                }
                else if(dir.equals("S"))
                {
                    py= py-1;
                    if(py<0)
                    {
                        py=py+1;
                        err="ER";
                        break;
                    }
                }
                else if(dir.equals("NE"))
                {
                    py=py+1;
                    px=px+1;
                    if(py>y||px>x)
                    {
                        py=py-1;
                        px=px-1;
                        err="ER";
                        break;
                    }
                }
                else if(dir.equals("SE"))
                {
                    py=py-1;
                    px=px+1;
                    if(py<0||px>x)
                    {
                        py=py+1;
                        px=px-1;
                        err="ER";
                        break;
                    }          
                }
                else if (dir.equals("SW"))
                {
                    py=py-1;
                    px=px-1;
                    if(py<0||px<0)
                    {
                        py=py+1;
                        px=px+1;
                        err="ER";
                        break;
                    }
                }
                else
                {
                    py=py+1;
                    px=px-1;
                    if(py>y||px<0)
                    {
                        py=py-1;
                        px=px+1;
                        err="ER";
                        break;
                    }
                }   
            }
        }
        if(err.length()==0) 
        {
            fpos = px+"-"+py+"-"+dir;
        }
        else 
        {
            fpos=px+"-"+py+"-"+dir+"-"+err;    
        }
        return fpos;
