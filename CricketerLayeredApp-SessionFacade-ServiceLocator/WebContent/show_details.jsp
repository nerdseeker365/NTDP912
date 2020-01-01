<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

   <h1 style="color:red;text-align:center"> ${param.name } Crickter Details are  </h1>
   
   <table border=1>
      <tr>
        <td>id </td> <td> ${profile.crickterId}  </td>
       </tr>
       <tr>
        <td>name </td> <td> ${profile.cricketerName}  </td>
       </tr>
       <tr>
        <td>Nation </td> <td> ${profile. nation}  </td>
       </tr>
       <tr>
        <td>state </td> <td> ${profile.state}  </td>
       </tr>
       <tr>
        <td>total Runs </td> <td> ${profile.totalRuns}  </td>
       </tr>
         <tr>
        <td>total Innings </td> <td> ${profile.totalIninings}  </td>
       </tr>
         <tr>
        <td>batting Avg </td> <td> ${profile.battingAvg}  </td>
       </tr>
         <tr>
        <td>bowling Avg </td> <td> ${profile.bolwingAvg}  </td>
       </tr>
   </table>
   
   <br><br>
    <a href="find_profile.html">home</a>
   
    