

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head id="Head1"><title>
	Student&#39;s CIA Marks
</title>
    <style type="text/css">

        .style5
        {
            width: 158px;
            height: 42px;
        }
        .style7
        {
            height: 42px;
        }
        .style23
        {
            width: 80px;
            height: 42px;
            text-align: right;
        }
        .style22
        {
            width: 137px;
            height: 42px;
            text-align: left;
        }
        .style6
        {
            width: 100px;
            height: 42px;
            text-align: right;
        }
        .style14
        {
            width: 158px;
            height: 26px;
        }
        .style15
        {
            height: 26px;
        }
        .style26
        {
            width: 80px;
            height: 26px;
        }
        .style21
        {
            height: 26px;
            text-align: left;
            width: 137px;
        }
        .style29
        {
            height: 26px;
            width: 100px;
        }
        .style16
        {
            width: 158px;
            height: 35px;
        }
        .style17
        {
            height: 35px;
        }
        .style25
        {
            width: 80px;
            height: 35px;
            text-align: right;
        }
        .style20
        {
            width: 137px;
            height: 35px;
            text-align: left;
        }
        .style10
        {
            width: 100px;
            height: 35px;
            text-align: right;
        }
        .style2
        {
            width: 158px;
        }
        .style27
        {
            width: 80px;
        }
        .style19
        {
            width: 137px;
            text-align: left;
        }
        .style4
        {
            width: 100px;
        }
        .style30
        {
            width: 158px;
            height: 12px;
        }
        .style31
        {
            height: 12px;
        }
        .style32
        {
            width: 80px;
            height: 12px;
        }
        .style33
        {
            height: 12px;
            text-align: left;
            width: 137px;
        }
        .style34
        {
            height: 12px;
            width: 100px;
        }
    </style>
        <script language="javascript" type="text/javascript" >
        var isShift=false;

        function keyUP(keyCode)
        {
              if(keyCode==16)
                    isShift = false;
        }
        function isNumeric(keyCode)
        {
          if(keyCode==16)
                isShift = true;

          return ((keyCode >= 48 && keyCode <= 57 || keyCode == 8 || 
                (keyCode >= 96 && keyCode <= 105)|| keyCode==46) && isShift == false);
        }
        
        
        function validate()
        {
          if (document.getElementById("ddlSession").value=="")
          {
             alert("Please Select Session");
             document.getElementById("ddlSession").focus();
             return false;          
          }
          if (document.getElementById("ddlSemester").value=="")
          {
             alert("Please Select Semester");
             document.getElementById("ddlSemester").focus();
             return false;          
          }
          if (document.getElementById("ddlStream").value=="")
          {
             alert("Please Select Stream");
             document.getElementById("ddlStream").focus();
             return false;          
          }
          if (document.getElementById("ddlDept").value=="")
          {
             alert("Please Select Department");
             document.getElementById("ddlDept").focus();
             return false;          
          }
          if (document.getElementById("txtRoll").value=="")
          {
             alert("Roll No can not be blank");
             document.getElementById("txtRoll").focus();
             return false;
          }
          return true;
         }   
    </script>
</head>
<body>
    <form method="post" action="./CIAMARKS.aspx" id="frmCIAMarks">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwULLTEyMDE3MzgzNDUPZBYCAgMPZBYKAgEPEA8WBh4ORGF0YVZhbHVlRmllbGQFB1Nlc3Npb24eDURhdGFUZXh0RmllbGQFB1Nlc3Npb24eC18hRGF0YUJvdW5kZ2QQFQIACTIwMTgtMjAxORUCAAkyMDE4LTIwMTkUKwMCZ2dkZAIDDxAPFgYfAAUHU2VtQ29kZR8BBQdTZW1Db2RlHwJnZBAVBAAHU2VtIC0gSQlTZW0gLSBJSUkHU2VtIC0gVhUEAAdTZW0gLSBJCVNlbSAtIElJSQdTZW0gLSBWFCsDBGdnZ2dkZAIFDxAPFgYfAAUJU3RyZWFtX0lEHwEFClN0cmVhbUNvZGUfAmdkEBUEAAJCQQNCU0MDQkFNFQQAATEBMgIxMRQrAwRnZ2dnFgFmZAIHDxBkZBYBZmQCCw8PZBYCHgdvbmNsaWNrBRFyZXR1cm4gdmFsaWRhdGUoKWRkjp6T8V4pm+eBDpVtSzs1LYj6lxDiLv37WYQtLbHd82g=" />

<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="092A803B" />
<input type="hidden" name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="/wEdAA6VhR07NEujfumEeQJoK+FHb+UXWva1oWT3WqhNzatWVjnWEvx4nfjMQqqynNAdpfzQS5HQgTWcg263rJ2nwCO5DBdXef+TfjQcyvts5G+bf0aDJ3qKGbGdbbp4b6wz7bvzW0kcJS6Rowot4MUtSIu7+/+/8mUscYXHfavRe8ZLGA9vV4H24pDHcb3XVxBeq1FPdBiYzy3zKpuAPbnYEIWXCZyGqOkmCCUQNWbtQyCkD2Cgi7bZoeUZp15hgt/0Psj7B9IIy3/auL1qy0FdEmc7ZRvD5D4zp/ieHLTNfeevNttrWrp2UXpe4TkDm8GrAQn8ulXnXcwXlqyDobOcHTuR" />
    <table align="center">
        <tr>
            <td style="font-size: xx-large; font-weight: bold; font-style: normal; color: #CC6600">
                <span lang="en-us">STUDENT&#39;S CIA MARKS</span></td>
        </tr>
    </table>
    <hr />
    <p>
        &nbsp;</p>
    <table align="center" bgcolor="White">
        <tr>
            <td class="style5">
                Select Session<span lang="en-us"> </span>
            </td>
            <td class="style7">
                <span lang="en-us">
                <select name="ddlSession" id="ddlSession">
	<option value=""></option>
	<option value="2018-2019">2018-2019</option>

</select>
                </span>
            </td>
            <td class="style23">
                &nbsp;</td>
            <td class="style16">
                <span lang="en-us">Select Semester </span>
            </td>
            <td class="style17">
                <span lang="en-us">
                <select name="ddlSemester" id="ddlSemester">
	<option value=""></option>
	<option value="Sem - I">Sem - I</option>
	<option value="Sem - III">Sem - III</option>
	<option value="Sem - V">Sem - V</option>

</select>
                </span>
            </td>
        </tr>
        <tr>
            <td class="style14">
                <span lang="en-us">&nbsp;</span></td>
            <td class="style15">
            </td>
            <td class="style26">
                &nbsp;</td>
            <td class="style21">
                &nbsp;</td>
            <td class="style29">
            </td>
        </tr>
        <tr>
            <td class="style22">
                Select <span lang="en-us">Stream</span></td>
            <td class="style6">
                <span lang="en-us">
                <select name="ddlStream" id="ddlStream">
	<option selected="selected" value=""></option>
	<option value="1">BA</option>
	<option value="2">BSC</option>
	<option value="11">BAM</option>

</select>
                </span>
            </td>
            <td class="style25">
            </td>
            
            <td class="style22">
                Select <span lang="en-us">Department</span></td>
            <td class="style6">
                <span lang="en-us">
                <select name="ddlDept" id="ddlDept">
	<option selected="selected" value=""></option>

</select>
                </span>
            </td>
        </tr>
        <tr>
            <td class="style30">
            </td>
            <td class="style31">
                &nbsp;</td>
            <td class="style32">
                &nbsp;</td>
            <td class="style33">
            </td>
            <td class="style34">
            </td>
        </tr>
        <tr>
            <td colspan="5" align="center">Enter Roll No &nbsp;&nbsp;&nbsp;
                <input name="txtRoll" type="text" maxlength="6" id="txtRoll" onkeydown="return isNumeric(event.keyCode);" onkeyup="keyUP(event.keyCode)" onpaste="return false;" style="TEXT-ALIGN: center" />
            </td>
        </tr>
        <tr>
            <td class="style30">
            </td>
            <td class="style31">
                &nbsp;</td>
            <td class="style32">
                &nbsp;</td>
            <td class="style33">
            </td>
            <td class="style34">
            </td>
        </tr>
    </table>
    <p>
    </p>
    <table align="center">
        <tr>
            <td align="center">
                <input type="submit" name="btnViewCIA" value="VIEW CIA MARKS" onclick="return validate();" id="btnViewCIA" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
