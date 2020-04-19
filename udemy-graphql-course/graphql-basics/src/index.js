import { GraphQLServer } from "graphql-yoga";

// Scalar types - String, Boolean, Int, Float, ID

// Demo user data
const users = [
  {
    id: "1",
    name: "Ayuth",
    email: "ayuth@example.com",
    age: 23,
  },
  {
    id: "2",
    name: "Sarah",
    email: "Sarah@example.com",
    age: 22,
  },
  {
    id: "3",
    name: "Mike",
    email: "Mike@example.com",
    age: null,
  },
];

const posts = [
  {
    id: 1,
    title: "Learn GraphQL",
    body: "Find some place to learn GraphQL.",
    published: true,
  },
  {
    id: 2,
    title: "Learn JavaScript",
    body: "Find some place to learn JavaScript.",
    published: true,
  },
  {
    id: 3,
    title: "Learn How to Love People",
    body: "Give love to everyone.",
    published: true,
  },
];

// Type definitions (schema)
const typeDefs = `
  type Query {
    users(query: String): [User!]!
    me: User!
    posts(query: String): [Post!]!
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
    users(parent, args, ctx, info) {
      if (!args.query) {
        return users;
      }
      return users.filter((user) => {
        return user.name
          .toLocaleLowerCase()
          .includes(args.query.toLocaleLowerCase());
      });
    },
    me() {
      return {
        id: "1212312121",
        name: "Ayuth",
        email: "ayuth@example.com",
        age: 23,
      };
    },
    posts(parent, args, ctx, info) {
      if (!args.query) {
        return posts;
      }
      return posts.filter((post) => {
        const isMatchTitle = post.title
          .toLocaleLowerCase()
          .includes(args.query);
        const isMatchBody = post.body.toLocaleLowerCase().includes(args.query);
        return isMatchTitle || isMatchBody;
      });
    },
  },
};

const server = new GraphQLServer({
  typeDefs,
  resolvers,
});

server.start(() => {
  console.log("This server is up");
});
