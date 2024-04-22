==========Request =========================
```xml
<?xml version="1.0" encoding="ISO-8859-1"?>
<methodCall>
   <methodName>SERVER.echo</methodName>
   <params>
      <param>
         <value>Hello XMLRPC testing !!</value>
      </param>
   </params>
</methodCall>

==========Response =========================
```xml
<?xml version="1.0" encoding="ISO-8859-1"?>
<methodResponse>
   <params>
      <param>
         <value>Yes,Reply:Hello XMLRPC testing !!</value>
      </param>
   </params>
</methodResponse>
