Generals
********

Standard Response Structure
===========================

All responses have same general structure

Response Parameters
-------------------

=========== ======== ======== ======= =================================================================================
Parameter   Type     Required Default Description
=========== ======== ======== ======= =================================================================================
responseId  String   True     -       The UUID of this response
timestamp   Date     True     -       Generation time of this response
success     Boolean  True     -       The status flag which indicates whether your API call is success
data        Any      True     null    The message body of this response, which can be any object that supported by JSON
error       Error    True     null    Associated Error object (if applicable)
=========== ======== ======== ======= =================================================================================

The response JSON structured like this

.. code:: json

   {
     "responseId": "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX",
     "timestamp":"2019-04-21T12:00:56.375+0000",
     "sucess": true,
     "data": null,
     "error": null
   }

.. code:: json

   {
     "responseId": "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX",
     "timestamp":"2019-04-21T12:00:56.375+0000",
     "sucess": false,
     "data": null,
     "error": {
       "type": "API.SECURITY.ACCESS_DENIED",
       "message": "Access Denied"
     }
   }

Standard Error Definition
=========================

Properties
----------

=========== ======== ======== ======= =========================
Parameter   Type     Required Default Description
=========== ======== ======== ======= =========================
type        String   True     -       Error Type
message     String   True     -       Explanation of this error
=========== ======== ======== ======= =========================

Example JSON Representation
---------------------------

.. code:: json

   {
     "type": "API.SECURITY.ACCESS_DENIED",
     "message": "Access Denied"
   }

HTTP Status Codes
=================

Success
-------

+-----------+-----------------------------------------------------------+
| Success   | Meaning                                                   |
| Code      |                                                           |
+===========+===========================================================+
| 200       | OK – Standard response for successful HTTP requests       |
+-----------+-----------------------------------------------------------+
| 201       | Created – The request has been fulfilled, resulting in    |
|           | the creation of a new resource.                           |
+-----------+-----------------------------------------------------------+
| 202       | Accepted — The request has been accepted for processing,  |
|           | but the processing has not been completed.                |
+-----------+-----------------------------------------------------------+

Errors
------

The LLZW API uses the following error codes:

+-----------------------------------------+----------------------------+
| Error Code                              | Meaning                    |
+=========================================+============================+
| 400                                     | Bad Request – Your request |
|                                         | is invalid.                |
+-----------------------------------------+----------------------------+
| 401                                     | Unauthorized – Your are    |
|                                         | unauthorized.              |
+-----------------------------------------+----------------------------+
| 403                                     | Forbidden — You do not     |
|                                         | have privilege to perform  |
|                                         | this request.              |
+-----------------------------------------+----------------------------+
| 404                                     | Not Found – The specified  |
|                                         | kitten could not be found. |
+-----------------------------------------+----------------------------+
| 405                                     | Method Not Allowed – You   |
|                                         | tried to access a kitten   |
|                                         | with an invalid method.    |
+-----------------------------------------+----------------------------+
| 406                                     | Not Acceptable – You       |
|                                         | requested a format that    |
|                                         | isn’t json.                |
+-----------------------------------------+----------------------------+
| 410                                     | Gone – The object          |
|                                         | requested has been removed |
|                                         | from our servers.          |
+-----------------------------------------+----------------------------+
| 429                                     | Too Many Requests – You’re |
|                                         | requesting too many        |
|                                         | kittens! Slow down!        |
+-----------------------------------------+----------------------------+
| 500                                     | Internal Server Error – We |
|                                         | had a problem with our     |
|                                         | server. Try again later.   |
+-----------------------------------------+----------------------------+
| 503                                     | Service Unavailable –      |
|                                         | We’re temporarily offline  |
|                                         | for maintenance. Please    |
|                                         | try again later.           |
+-----------------------------------------+----------------------------+
