//
//  RepositoryContainer.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "RepositoryContainer.h"

@implementation RepositoryContainer

-(id)init{
    if(self = [super init]){
        // to be implemented
    }
    return self;
}

// getter methods
-(NSMutableArray*)getRepositories { return repositories; }

// setter methods
-(void)setRepositories:(NSMutableArray*)value { repositories = value; }

@end