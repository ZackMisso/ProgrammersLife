//
//  RepositoryContainer.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface RepositoryContainer : NSObject{
    NSMutableArray *repositories;
}

// getter methods
-(NSMutableArray*)getRepositories;

// setter methods
-(void)setRepositories:(NSMutableArray*)value;

@end
