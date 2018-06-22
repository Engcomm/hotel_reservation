import media
import fresh_tomatoes



matrix=media.Movie("Matrix","It depicts a dystopian future in which reality as perceived by most humans is actually a simulated reality called the Matrix",
                   "http://www.impawards.com/1999/posters/matrix_ver2_xlg.jpg","https://www.youtube.com/watch?v=HK-r3W7PrRU")


jumanji=media.Movie("Jumanji","four teenagers who are transported into the video game world of Jumanji",
                    "http://www.impawards.com/2017/posters/jumanji_welcome_to_the_jungle_ver3.jpg","https://www.youtube.com/watch?v=2QKg5SZ_35I")

star=media.Movie("Star Wars","Shortly after the battle of Starkiller Base, General Leia Organa leads Resistance forces to flee D'Qar when a First Order fleet arrives",
                    "http://www.impawards.com/2017/posters/star_wars_the_last_jedi_ver2.jpg","https://www.youtube.com/watch?v=Q0CbN8sfihY")

avatar=media.Movie("Avatar","A marine on an alien planet",
                   "http://www.impawards.com/2009/posters/avatar.jpg","https://www.youtube.com/watch?v=TbliHS_5GhM")

wonder=media.Movie("Wonder","Born with facial differences that, up until now, have prevented him from going to a mainstream school",
                   "http://www.impawards.com/2017/posters/wonder_ver13.jpg","https://www.youtube.com/watch?v=ngiK1gQKgK8")

masha=media.Movie("Masha","Comdey little girl",
                   "https://image.tmdb.org/t/p/original/8PNIWHBy01TZIVUzqKeGj5RHvnv.jpg","https://www.youtube.com/watch?v=zQYE7lVkaFI")

print (media.Movie.list1)
print (media.Movie.__doc__)
print (media.Movie.__module__)
print (media.Movie.__name__)

#movies=[matrix,jumanji,star,avatar,wonder,masha]
#fresh_tomatoes.open_movies_page(movies)




#print (avatar.storyline)
#print (matrix.storyline)

#matrix.show_trailer()
#wonder.show_trailer()
#jumanji.show_trailer()
#star.show_trailer()
#avatar.show_trailer()
