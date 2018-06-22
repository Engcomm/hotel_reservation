import twilio
print(twilio.__version__)


from twilio.rest import Client

account_sid = "AC8b4936936a2************"
auth_token = "54f232dcb3ef29***********"
client = Client(account_sid, auth_token)

message = client.messages.create (
    body="Hi Loloooo",
    to="+2********",
    from_="+2********")
print "Message sent"
