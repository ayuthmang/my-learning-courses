import { GraphQLServer } from "graphql-yoga";

// Scalar types - String, Boolean, Int, Float, ID
//

// Type definitions (schema)
const typeDefs = `
  type Query {
    me: User!
    post: Post!
  }

  type User {
    id: ID!
    name: String!
    email: String
    age: Int
  }

  type Post {
    id: ID!,
    title: String!
    body: String!
    published: Boolean!
  }
`;

// Resolvers
const resolvers = {
  Query: {
    me() {
      return {
        id: '1212312121',
        name: 'Ayuth',
        email: 'ayuth@example.com',
        age: 23
      }
    },
    post() {
      return {
        id: '12312121',
        title: 'The New York Times',
        body: "Lorem ipsum",
        published:  false
      }
    }
  },
};

const server = new GraphQLServer({
  typeDefs,
  resolvers,
});

server.start(() => {
  console.log("This server is up");
});
