
public class conexion {

	
	
	// Method to make a connection to the mongodb server listening on a default port
    private MongoClient getConnection() {
        
    	String url = "mongodb+srv://Mad37b:Pascal@mad37b.vqsepsr.mongodb.net/?retryWrites=true&w=majority";
 
        MongoClient mongoClntObj = MongoClients.create(url);
        return mongoClntObj;
    }
        
        public Document findFilm (String filmName) {
        	MongoClient conn =this.getConnection();
        	MongoDatabase database = conn.getDatabase("sample_mflix");
            MongoCollection<Document> collection = database.getCollection("movies");
            Bson equalComp=eq("title",filmName);
            Document doc = collection.find(equalComp).first();
            if (doc != null) {
                System.out.println(doc.toJson());
                
                
            } else {
            	
                System.out.println("No matching documents found.");
                
                
            }
            return doc;	
        }
     
        // Method to search a user in the mongodb
       
    }  
        
        
}
